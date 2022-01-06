package com.shajar.auth.controller;

import com.shajar.auth.data.dto.RegistrationForm;
import com.shajar.auth.data.dto.User;
import com.shajar.auth.data.repo.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("register")
public class RegistrationController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    RegistrationController(UserRepository userRepository,
                           PasswordEncoder passwordEncoder){
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;
    }

    @GetMapping("")
    public String getHome(){
        return "Hello Register";
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public User processRegistration(@RequestBody RegistrationForm form){
        return userRepository.saveAndFlush(form.toUser(passwordEncoder));
    }
}
