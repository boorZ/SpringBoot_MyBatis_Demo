package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.type.utils.ZlUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public PageInfo<User> gets(int pageNum, int pageSize){
        pageNum = pageNum == 0 ? 1 : pageNum;
        pageSize = pageSize == 0 ? 1 : pageSize;
        return  userService.findAll(pageNum, pageSize);
    }

    @DeleteMapping(value = "/deleteone")
    public void del(Integer id){
        userService.deleteById(id);
    }
}
