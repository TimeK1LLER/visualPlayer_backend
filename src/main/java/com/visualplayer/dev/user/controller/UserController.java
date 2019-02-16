package com.visualplayer.dev.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.visualplayer.dev.base.json.JsonResponse;
import com.visualplayer.dev.base.json.StatusCode;
import com.visualplayer.dev.user.bean.User;
import com.visualplayer.dev.user.bean.UserInfo;
import com.visualplayer.dev.user.bean.role.RoleMapping;
import com.visualplayer.dev.user.bean.role.UserRole;
import com.visualplayer.dev.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public JsonResponse userRegister(@RequestBody JSONObject object){
        try{
            String username = object.getString("username");
            String password = object.getString("password");
            String captcha = object.getString("captcha");
            if(userService.getUser(username) != null){
                return new JsonResponse<>(StatusCode.USER_EXIST);
            }else{
                User user = new User();
                try{
                    user.setUserInfo(new UserInfo());
                    user.setUserRole(new UserRole(RoleMapping.USER));
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setUserRole(new UserRole(RoleMapping.USER));
                    userService.createUser(user);
                }catch (Exception e){
                    return new JsonResponse<>(StatusCode.SYS_INTERNAL_ERROR,e.toString());
                }
                return new JsonResponse<>(StatusCode.OK, "User create successfully");
            }
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResponse(StatusCode.BAD_REQUEST);
        }
    }


}
