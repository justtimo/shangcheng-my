package com.wby.sc.scuser.controller;

import com.wby.sc.scuser.bean.UmsMember;
import com.wby.sc.scuser.bean.UmsMemberReceiveAddress;
import com.wby.sc.scuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String  index(){
        return "helloe user";
    }

    //查询所有用户UmsMember
    @RequestMapping("/getAll")
    public List<UmsMember>  getAll(){
        List<UmsMember> list=userService.getAllUser();
        return list;
    }

    //根据外键MemberId查询UmsMemberReceiveAddress
    @RequestMapping("/getAddress")
    public List<UmsMemberReceiveAddress>  getAddressByMemberId(String memberId){//@RequestBody可以接受前段传过来的json格式参数
        List<UmsMemberReceiveAddress> list=userService.getAddressByMemberId(memberId);
        return list;
    }


}
