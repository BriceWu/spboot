package com.bricewu.spboot.mapper;

import org.springframework.stereotype.Repository;
import com.bricewu.spboot.model.Person;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
/**
 * Create by BriceWu on 2018/7/1
 */

@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT * FROM Person WHERE id = #{id}")
    Person selectUser(int id);
}
