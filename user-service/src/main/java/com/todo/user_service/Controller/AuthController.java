package com.todo.user_service.Controller;


import com.todo.user_service.DTO.AuthResDTO;
import com.todo.user_service.DTO.UserRequestDTO;
import com.todo.user_service.Entity.User;
import com.todo.user_service.Repository.UserRepo;
import com.todo.user_service.Service.interfaces.UserService;
import com.todo.user_service.constants.Endpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Endpoint.AUTH)
@Slf4j
public class AuthController {
    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String CreatePayment(@RequestBody UserRequestDTO userRequestDTO)
    {
        log.info("User Created from service");
        String token=userService.createUser(userRequestDTO);
        //return new ResponseEntity<>(token, HttpStatus.CREATED);
        return token;
    }




}
