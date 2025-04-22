package com.todo.Task.Service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
    @GetMapping("/get")
    public String fun() {
        System.out.println("hello world"); // This prints in the server console
        return "Hello, World!"; // This will be displayed in the browser
    }
}
