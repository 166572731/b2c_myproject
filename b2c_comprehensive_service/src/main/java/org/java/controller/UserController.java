package org.java.controller;

import org.java.entity.User;
import org.java.service.Demotest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private Demotest demotest;
    @RequestMapping("show/{uid}")
    public User selectUser(@PathVariable("uid") Integer uid){
        return demotest.selectByPrimaryKey(uid);
    }
}
