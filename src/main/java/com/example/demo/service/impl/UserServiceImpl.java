package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.type.utils.ZlUtils;
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
    public ZlUtils saveAndFlush(User user) {
        if(user.getId() == null){
            System.out.println("ADD");
            userMapper.save(user);
            return ZlUtils.Success(null);
        }else{
            System.out.println("PUU");
            userMapper.flush(user);
            return ZlUtils.Success(null);
        }
    }

    @Override
    public ZlUtils deleteById(Integer id) {
        userMapper.deleteById(id);
        return ZlUtils.Success(null);
    }

}