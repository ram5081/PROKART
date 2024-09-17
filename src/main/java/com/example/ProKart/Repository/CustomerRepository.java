package com.example.ProKart.Repository;

import com.example.ProKart.Model.Customer;
import com.example.ProKart.Model.Enum.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findByAge(int age);

   // List<Customer> findByAge&Gender(int age, Gender gender);

    //nativeQuery means writing query in form of normal sqlDatabase table name.
    //Non native Query means writing query in terms of java.
    @Query(value = "select * from customer where gender = :g and age >= :age" , nativeQuery = true)
    List<Customer> getCustomerByGenderAndAgeGreaterThan(String g , int age);
}


