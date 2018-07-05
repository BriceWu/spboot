package com.bricewu.spboot.service;

import com.bricewu.spboot.model.Person;
/**
 * Create by BriceWu on 2018/7/1
 */
public interface UserService{
    Person selectUser(int id);
}
