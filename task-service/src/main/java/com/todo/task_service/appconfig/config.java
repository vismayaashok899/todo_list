package com.todo.task_service.appconfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    ModelMapper modelMapper()
    {
        return new ModelMapper();
    }

}
