package com.todo.user_service.Service.impl;

import com.todo.user_service.DTO.AuthResDTO;
import com.todo.user_service.DTO.UserRequestDTO;
import com.todo.user_service.Entity.User;
import com.todo.user_service.Repository.UserRepo;
import com.todo.user_service.Service.interfaces.UserService;
import com.todo.user_service.constants.ErrorCodeEnum;
import com.todo.user_service.exception.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo)
    {
        this.userRepo=userRepo;
    }

    @Override
    public String createUser(UserRequestDTO userRequestDTO) {
        log.info("Checking if email already exists: " + userRequestDTO.getEmail());
        if(userRepo.findByEmail(userRequestDTO.getEmail()).isPresent()) {
            log.error("Email already exists: " + userRequestDTO.getEmail());
            throw new ValidationException(
                    ErrorCodeEnum.EMAIL_ERROR.getErrorCode(),
                    ErrorCodeEnum.EMAIL_ERROR.getErrorMessage(),
                    HttpStatus.CONFLICT);
        }
        log.info("Received the request from controller");
        User user=User.builder()
                .name(userRequestDTO.getName())
                .email(userRequestDTO.getEmail())
                .password(userRequestDTO.getPassword())
                .build();
        userRepo.save(user);
        return "user Create successfully";
    }
}
