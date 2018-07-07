package com.bricewu.spboot.service.impl;

import com.bricewu.spboot.dao.UserMapper;
import com.bricewu.spboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bricewu.spboot.service.UserService;
/**
 * Create by BriceWu on 2018/7/5
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

    public int addUser(Person person){
        return userMapper.insertUser(person);
    }
}
