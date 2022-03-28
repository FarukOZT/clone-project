package com.product.clone.controller;

import com.product.clone.dto.UserDto;
import com.product.clone.entity.User;
import com.product.clone.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clone/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/add")
    public UserDto addUser(@RequestBody UserDto user){
        return userService.addUser(user);
    }

}
