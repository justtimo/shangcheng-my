package com.wby.sc.scuser.controller;

import com.wby.sc.scuser.bean.UmsMember;
import com.wby.sc.scuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @RequestMapping("/getAll")
    public List<UmsMember>  getAll(){
        List<UmsMember> list=userService.getAllUser();
        return list;
    }


}
