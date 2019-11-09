package com.wby.sc.scuser.service.impl;

import com.wby.sc.scuser.bean.UmsMember;
import com.wby.sc.scuser.mapper.UserMapper;
import com.wby.sc.scuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> list=userMapper.queryAllUser();
        return list;
    }
}
