package com.visualplayer.dev.user.bean.role;

// 角色关系映射表
public enum RoleMapping {

    // 普通用户角色
    USER(1,"user","Normal User"),
    // 管理员角色
    ADMIN(2,"admin","Normal Administrator"),
    // 超级管理员 用于整个系统管理
    SUPER_ADMIN(3,"super_admin","Super User Administrator")

    ;

    // 角色号
    int roleNum;
    // 角色名
    String roleName;
    // 角色描述
    String roleDescribe;

    RoleMapping(int roleNum, String roleName,String roleDescribe) {
        this.roleNum = roleNum;
        this.roleName = roleName;
        this.roleDescribe = roleDescribe;
    }
}