package com.bricewu.spboot.service.impl;

import com.bricewu.spboot.dao.UserMapper;
import com.bricewu.spboot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.bricewu.spboot.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by BriceWu on 2018/7/5
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 清除获取所有用户的redis缓存
     * @param id
     * @return
     */
    @CacheEvict(value = "UserCache" ,key = "'user.getAllUsers'")
    public String selectUser(int id) {
        return userMapper.selectUser(id).toString();
    }

    /**
     * 添加用户
     * @param person
     * @return
     */
    public int addUser(Person person){
        return userMapper.insertUser(person);
    }

    /**
     * 缓存获取所有用户
     * @return
     */
    @Cacheable(value = "UserCache" ,key = "'user.getAllUsers'")
    public String getAllUser(){
        List<Person> users = userMapper.getAllUser();
        List<String> datas = new ArrayList<>();
        for(Person p : users){
            datas.add(p.toString());
        }
        return String.join("***",datas);
    }
}
