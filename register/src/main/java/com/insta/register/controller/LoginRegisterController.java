package com.insta.register.controller;

import com.insta.register.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//mongo "mongodb+srv://instaproject-s3q76.mongodb.net/test" --username kartik

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/intro")
public class LoginRegisterController {

    MongoOperations mongoOperations;

    @PostMapping("/register")
    public String registerUser(
            @RequestBody User name
    ) {

        System.out.println(name);
        mongoOperations.save(name, "user");

        return "Hello, World!";
    }
}
