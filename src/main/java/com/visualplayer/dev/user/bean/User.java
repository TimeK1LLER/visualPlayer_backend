package com.visualplayer.dev.user.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.visualplayer.dev.user.bean.role.UserRole;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    Long uid;

    @Column
    String username;

    // 盐后密码
    @Column
    @JsonIgnore
    String password;

    @OneToOne
    @JsonIgnore
    UserInfo userInfo;

    @OneToOne
    UserRole userRole;

}
