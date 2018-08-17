package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select(value = "select * from t_user where id = #{id}")
    User findById(int id);

    @Select(value = "select * from t_user")
    List<User> findAll();

    @Insert(value = "insert into t_user(name,sex,age,jog) values(#{name},#{sex},#{age},#{jog})")
    void save(User user);

    @Update(value = "update t_user set name=#{name},sex=#{sex},age=#{age},jog=#{jog} " +
            "where id=#{id}")
    void flush(User user);

    @Delete(value = "delete from t_user where id=#{id}")
    void deleteById(Integer id);
}