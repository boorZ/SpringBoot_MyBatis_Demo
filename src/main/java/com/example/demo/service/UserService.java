package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(Integer id);

    void saveAndFlush (User user);

    void deleteById (Integer id);
}