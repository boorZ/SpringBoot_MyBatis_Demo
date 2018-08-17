package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll(){
        return  userMapper.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void saveAndFlush(User user) {
        if(user.getId() == null){
            userMapper.save(user);
        }else{
            userMapper.flush(user);
        }
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

}