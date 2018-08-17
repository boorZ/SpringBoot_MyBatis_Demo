package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
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
        return "YES";
    }

    @ResponseBody
    @RequestMapping(value = "/findSaveAndFlush", method = RequestMethod.PUT)
    public void put(User user){
        userService.saveAndFlush(user);
    }

    @ResponseBody
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public User get(Integer id){
        return userService.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> gets(){
        return  userService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/deleteById", method = RequestMethod.DELETE)
    public void del(Integer id){
        userService.deleteById(id);
    }
}
