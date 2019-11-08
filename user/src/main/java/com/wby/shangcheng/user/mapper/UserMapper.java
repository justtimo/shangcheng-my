package com.wby.shangcheng.user.mapper;

import com.wby.sc.bean.UmsMemberReceiveAddress;
import com.wby.sc.bean.UmsMembers;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UmsMembers> {

    public List<UmsMembers> findAll();
    public UmsMembers getOne(String id);
    public void deleteById(String id);
    public void update(UmsMembers umsMembers);
    public List<UmsMemberReceiveAddress> getAddressByUserId(String id);
}
