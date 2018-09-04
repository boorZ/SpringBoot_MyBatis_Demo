package com.example.demo.service;

import com.example.demo.model.User;
import com.example.type.utils.ZlUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(Integer id);

    ZlUtils saveAndFlush (User user);

    ZlUtils deleteById (Integer id);
}