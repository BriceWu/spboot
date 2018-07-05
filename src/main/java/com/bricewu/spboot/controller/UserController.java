package com.bricewu.spboot.controller;

import com.bricewu.spboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by BriceWu on 2018/7/1
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    public String selectUser (@PathVariable int id){
        return userService.selectUser(id).toString();
    }
}
