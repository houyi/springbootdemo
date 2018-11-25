package com.houyi.service;

import com.houyi.mapper.UserMapper;
import com.houyi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//业务层
@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    //查询ID
    public User querById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //添加对象
    public void insertUser(User user) {
        userMapper.insert(user);
    }
}
