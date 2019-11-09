package com.wby.sc.scuser.mapper;

import com.wby.sc.scuser.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> queryAllUser();
}
