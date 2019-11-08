package com.wby.sc.service;


import com.wby.sc.bean.UmsMemberReceiveAddress;
import com.wby.sc.bean.UmsMembers;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface IUserService {
    List<UmsMembers> getAllUser();
    public List<UmsMemberReceiveAddress> getAdrressByUserId(String id);
}
