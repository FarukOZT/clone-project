package com.product.clone.services;

import com.product.clone.dto.UserDto;
import com.product.clone.entity.User;
import com.product.clone.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public UserDto addUser(UserDto userDto){
        User user =new User();
        user.setName(userDto.getName());
        user.setLastName(userDto.getLastName());
        user.setUserName(userDto.getUserName());
        userRepository.save(user);
        return userDto;
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
