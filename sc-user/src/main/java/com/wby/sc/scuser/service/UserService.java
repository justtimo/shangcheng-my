package com.wby.sc.scuser.service;

import com.wby.sc.scuser.bean.UmsMember;
import com.wby.sc.scuser.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId);
}
