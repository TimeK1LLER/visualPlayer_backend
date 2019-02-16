package com.visualplayer.dev.user.bean.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.visualplayer.dev.user.bean.permission.Permission;
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

    public UserRole(RoleMapping mapping){
        this.roleNum = mapping.roleNum;
        this.roleName = mapping.roleName;
        this.setPermission();
    }

    public void setPermission(){
        switch (roleNum){
            case 1:
                this.setPermission(Permission.USER);
                break;
            case 2:
                this.setPermission(Permission.ADMIN);
                break;
            case 3:
                this.setPermission(Permission.SUPER_ADMIN);
                break;
        }
    }

    public void setPermission(Permission permission){
        this.permission = permission.getAction();
    }

}
