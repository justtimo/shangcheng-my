package com.wby.sc.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@Entity
@Table(name = "ums_member")
public class UmsMembers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//主键返回策略？
    @Column(name = "id")
    private String id;
    @Column(name = "member_level_id")
    private String memberLevelId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "status")
    private Integer status;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "icon")
    private String icon;
    @Column(name = "gender")
    private Integer gender;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "city")
    private String city;
    @Column(name = "job")
    private String job;
    @Column(name = "personalized_signature")
    private String personalizedSignature;
    @Column(name = "source_type")
    private Integer sourceType;
    @Column(name = "integration")
    private Integer integration;
    @Column(name = "growth")
    private Integer growth;
    @Column(name = "luckey_count")
    private Integer luckeyCount;
    @Column(name = "history_integration")
    private Integer historyIntegration;

    public static void main(String[] args) {
        UmsMembers umsMembers=new UmsMembers();
    }
}
