package com.Iggy.jobboard.controller;


import com.Iggy.jobboard.entity.User;
import com.Iggy.jobboard.security.JwtUtil;
import com.Iggy.jobboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/auth")
@RestController
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User saveUserDatabase(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        User foundUser = userService.getUserByEmail(user.getEmail());
        if(user.getPassword().equals(foundUser.getPassword())){
            return jwtUtil.generateToken(foundUser.getEmail());
        }else{
            return "Invalid credentials";
        }
    }
}
