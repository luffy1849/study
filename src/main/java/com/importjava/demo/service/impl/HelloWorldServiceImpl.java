package com.importjava.demo.service.impl;

import com.importjava.demo.dao.UserMapper;
import com.importjava.demo.model.User;
import com.importjava.demo.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements IHelloWorldService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(String username) {
        User user = new User();
        user.setName(username);
        userMapper.insert(user);
    }
}
