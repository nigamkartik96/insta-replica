package com.insta.register.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/intro")
public class LoginRegsiterController {

    @GetMapping("/register")
    public String registerUser(
            // @RequestBody User userData
    ) {
        return "Hello, World!";
    }
}
