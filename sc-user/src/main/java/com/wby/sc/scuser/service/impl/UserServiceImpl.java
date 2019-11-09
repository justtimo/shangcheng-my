package com.wby.sc.scuser.service.impl;

import com.wby.sc.scuser.bean.UmsMember;
import com.wby.sc.scuser.bean.UmsMemberReceiveAddress;
import com.wby.sc.scuser.mapper.UmsMemberReceiveAddressMapper;
import com.wby.sc.scuser.mapper.UserMapper;
import com.wby.sc.scuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        //List<UmsMember> list=userMapper.queryAllUser();
        List<UmsMember> list=userMapper.selectAll();//通用maper
        return list;
    }

    //根据外键MemberId查询UmsMemberReceiveAddress
    @Override
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId) {
        /**
         * 方法1。这个地方是错误的。
         * 因为example一般与update一起用，
         */
        //Example代表查询规则
        Example e=new Example(UmsMemberReceiveAddress.class);
        //根据什么规则查询.property:UmsMemberReceiveAddress的外键
        //value：传过来的参数：String memberId
        e.createCriteria().andEqualTo("memberId","memberId");
        List<UmsMemberReceiveAddress> addresses1 = umsMemberReceiveAddressMapper.selectByExample(e);//方法1
/**
         * 方法2
         * 通过umsMemberReceiveAddress的映射查询，查询条件是：哪个字段不为空，就根据此字段作为过滤条件查询
         */
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> addresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);//方法2
        return  addresses;
    }
}
