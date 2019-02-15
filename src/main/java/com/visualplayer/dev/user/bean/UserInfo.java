package com.visualplayer.dev.user.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// 用户个人信息
@Entity
public class UserInfo {

    @Id
    @GeneratedValue
    Long uiid;

    // 昵称
    @Column
    String nickName;

    // 用户性别
    @Column
    Boolean sex;

    // 个人签名
    @Column
    String selfSign;

    // 头像路径
    @Column
    String headImgPath;

}
