package com.example.ProKart.Controller;

import com.example.ProKart.DTO.Request.CustomerRequest;
import com.example.ProKart.DTO.Response.CustomerResponse;
import com.example.ProKart.Model.Customer;
import com.example.ProKart.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.addCustomer(customerRequest);
    }

    //findbyage api
    @GetMapping("/age/{age}")
    public List<CustomerResponse> findByAge(@PathVariable("age") int age){
        return customerService.findByAge(age);

    }

    @GetMapping("/gender/{gender}/age/{age}")
    //get people of particular gender and age greater or lesser than (X).
    public List<CustomerResponse> findByGenderAndAgeGreaterThan(@PathVariable("gender") String gender ,
                                                                @PathVariable("age") int age){
        return customerService.findByGenderAndAgeGreaterThan(gender, age);
    }

}
