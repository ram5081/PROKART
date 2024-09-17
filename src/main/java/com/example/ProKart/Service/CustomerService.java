package com.example.ProKart.Service;

import com.example.ProKart.DTO.Request.CustomerRequest;
import com.example.ProKart.DTO.Response.CustomerResponse;
import com.example.ProKart.Model.Customer;
import com.example.ProKart.Repository.CustomerRepository;
import com.example.ProKart.Transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);
        Customer savedcustomer = customerRepository.save(customer);
        return CustomerTransformer.customerToCustomerResponse(savedcustomer);
    }

    public List<CustomerResponse> findByAge(int age) {
        List<Customer> customers = customerRepository.findByAge(age);
        List<CustomerResponse> customerResponses = new ArrayList<>();

        for(Customer customer: customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;
    }

    public List<CustomerResponse> findByGenderAndAgeGreaterThan(String gender, int age) {
        List<Customer> customers = customerRepository.getCustomerByGenderAndAgeGreaterThan(gender, age);
        List<CustomerResponse> customerResponses = new ArrayList<>();

        for(Customer customer: customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }
        return customerResponses;


    }
}
