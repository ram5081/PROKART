package com.example.ProKart.DTO.Request;

import com.example.ProKart.Model.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerRequest {

    String name;
    int age;
    String email;
    Gender gender;

}
