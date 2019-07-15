package org.java.service;

import org.java.entity.User;
import org.java.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Demotest {
    @Autowired
    private UserMapper userMapper;
    public User selectByPrimaryKey(Integer uid){
        return userMapper.selectByPrimaryKey(uid);
    }
}
