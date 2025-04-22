package com.todo.user_service.DTO;

import lombok.Builder;
import lombok.Data;

@Data

public class UserRequestDTO {
    private String name;


    //@Email(message = "Enter a valid email")
    //@NotBlank(message = "Email is required")
    private String email;


    //@NotBlank(message = "Password cannot be empty")
    private String password;

}
