package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.type.utils.ZlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author zhoulin
 * @date 2018/8/17
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String hellos(){
        return "index3";
    }

    @PutMapping(value = "/findSaveAndFlush")
    public void put(User user){
        userService.saveAndFlush(user);
    }

    @PostMapping("/addone")
    public ZlUtils add(User user){
        return userService.saveAndFlush(user);
    }

    @GetMapping("/findone")
    public User get(Integer id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/findAll")
    public List<User> gets(){
        return  userService.findAll();
    }

    @DeleteMapping(value = "/deleteone")
    public void del(Integer id){
        userService.deleteById(id);
    }
}
