package com.visualplayer.dev.user.bean.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserRole {

    @Id
    @GeneratedValue
    private Long rid;

    @JsonIgnore
    @Column
    private Integer roleNum;

    @Column
    private String roleName;

    @Column
    // 所有用户默认有view权限
    private String permission = "view";

    public void setRole(RoleMapping mapping){
        this.roleName = mapping.roleName;
        this.roleNum = mapping.roleNum;
    }

}
