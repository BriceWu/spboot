package com.bricewu.spboot.dao;

import org.springframework.stereotype.Repository;
import com.bricewu.spboot.model.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create by BriceWu on 2018/7/1
 */

@Mapper
@Repository
public interface UserMapper {

    Person selectUser(int id);

    int insertUser(Person person);

    /**
     * 获取所有用户信息
     * @return
     */
    List<Person> getAllUser();
}
