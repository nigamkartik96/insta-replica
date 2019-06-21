package com.insta.register.controller;

import com.insta.register.model.UserData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/intro")
public class LoginAndRegisterController {

    @GetMapping("/register")
    public String saveUser(
           // @RequestBody UserData userData
    ) {
        return "Hello World!";
    }
}
