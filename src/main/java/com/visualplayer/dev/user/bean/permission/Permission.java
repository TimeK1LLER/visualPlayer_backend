package com.visualplayer.dev.user.bean.permission;

public enum Permission{
    // 普通用户 对列表进行增删改查
    USER("view,editList"),
    // 普通管理员对平台资源进行增删改查
    ADMIN("view,editSource"),
    // 超级管理员对 资源、用户、管理员进行管理
    SUPER_ADMIN("view,editSource,editUser,editAdmin")
    ;
    String action;

    Permission(String action) {
        this.action = action;
    }
}
