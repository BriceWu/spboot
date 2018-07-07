package com.bricewu.spboot.service;

import com.bricewu.spboot.model.Person;

/**
 * Create by BriceWu on 2018/7/1
 */
public interface UserService{
    String selectUser(int id);

    int addUser(Person person);

    String getAllUser();
}
