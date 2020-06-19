package com.shivaot.redispoc.repositories;

import com.shivaot.redispoc.model.User;

import java.util.Map;


public interface UserRepository {

    void save(User user);
    Map<String, User> findAll();
    User findById(String id);
    void update(User user);
    void deleteById(String id);

}
