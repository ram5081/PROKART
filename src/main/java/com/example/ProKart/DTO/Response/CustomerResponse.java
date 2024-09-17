package com.example.ProKart.DTO.Response;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerResponse {
    String name;
    String email;
}
