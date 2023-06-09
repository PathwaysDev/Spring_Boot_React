package com.pathways.dev.trail1.web;

import com.pathways.dev.trail1.model.user.UserRepository;
import com.pathways.dev.trail1.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
