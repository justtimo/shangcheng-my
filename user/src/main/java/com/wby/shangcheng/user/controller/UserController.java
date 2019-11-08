package com.wby.shangcheng.user.controller;

import com.wby.sc.bean.UmsMemberReceiveAddress;
import com.wby.sc.bean.UmsMembers;
import com.wby.sc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    @ResponseBody
    public  String index(){
        return "hello,user";
    }


    @RequestMapping("getAll")
    @ResponseBody
    public List<UmsMembers> getAllUser(){
        List<UmsMembers> umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getAd")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAdrress(String id){
        List<UmsMemberReceiveAddress> adrress=userService.getAdrressByUserId(id);
        return adrress;
    }

}
