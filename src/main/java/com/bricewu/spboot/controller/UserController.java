package com.bricewu.spboot.controller;

import com.bricewu.spboot.model.Person;
import com.bricewu.spboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser (@RequestBody Person person){
        return userService.addUser(person);
    }

    @RequestMapping("/showUsers")
    public String showAllUser (){
        return userService.getAllUser();
    }
}
