package com.shivaot.redispoc.controllers;

import com.shivaot.redispoc.model.User;
import com.shivaot.redispoc.repositories.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserRepositoryImpl userRepository;

    @GetMapping("add/{id}/{name}")
    public User add(@PathVariable("id") final String id, @PathVariable("name") final String name) {
        userRepository.save(new User(id,name,20000L));
        return userRepository.findById(id);
    }

    @GetMapping("/update/{id}/{name}")
    public User update(@PathVariable("id") final String id, @PathVariable("name") final String name) {
        userRepository.update(new User(id,name,10000L));
        return userRepository.findById(id);
    }

    @GetMapping("/all")
    public Map<String,User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") String id) {
        return userRepository.findById(id);
    }

    @GetMapping("delete/{id}")
    public Map<String,User> deleteById(@PathVariable("id") String id) {
        userRepository.deleteById(id);
        return getAll();
    }
}
