package com.wby.shangcheng.user.service.impl;

import com.wby.sc.bean.UmsMemberReceiveAddress;
import com.wby.sc.bean.UmsMembers;
import com.wby.sc.service.IUserService;
import com.wby.shangcheng.user.mapper.UmsAddress;
import com.wby.shangcheng.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsAddress umsAddress;

    @Override
    public List<UmsMembers> getAllUser() {
        //List<UmsMembers> umsMembers=userMapper.findAll();
        List<UmsMembers> umsMembers=userMapper.selectAll();//通用mapper提供的方法
        return umsMembers;
    }

    /**
     * 根据用户ID查询用户地址。selectByExample()方法此时用于查询与select()方法是相同的
     * 用户id是外键.使用selectByExample()方法.Example()一般用于更新update使用，用于查询比较少。
     * example.createCriteria()根据什么规则查询，后面跟具体的查询规则
     * andEqualTo（property,value）根据memberId查询。
     * property:    memberId是UmsMemberReceiveAddress中的memberId,
     * value:   方法中传过来的String id。
     *
     * 快捷键:ctrl+alt+V   生成本地变量
     *       ctrl+E     显示之前操作过的列表
     *
     * @param id
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getAdrressByUserId(String id) {
        /*Example example=new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",id);
        List<UmsMemberReceiveAddress> addrress=umsAddress.selectByExample(example);
        *///蠢办法：
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);
        //List<UmsMemberReceiveAddress> addrress=umsAddress.selectByExample(umsMemberReceiveAddress);
        List<UmsMemberReceiveAddress> addrress = umsAddress.select(umsMemberReceiveAddress);
        return  addrress;
    }
}
