package com.example.demo.service;

import com.example.demo.model.User;
import com.example.type.utils.ZlUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    PageInfo<User> findAll(int pageNum, int pageSize);

    User findById(Integer id);

    ZlUtils saveAndFlush (User user);

    ZlUtils deleteById (Integer id);
}