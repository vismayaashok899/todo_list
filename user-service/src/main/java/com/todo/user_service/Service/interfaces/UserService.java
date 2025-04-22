package com.todo.user_service.Service.interfaces;

import com.todo.user_service.DTO.AuthResDTO;
import com.todo.user_service.DTO.UserRequestDTO;

public interface UserService {

    public String createUser(UserRequestDTO userRequestDTO);

}
