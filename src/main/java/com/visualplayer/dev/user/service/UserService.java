package com.visualplayer.dev.user.service;

import com.visualplayer.dev.sys.syslog.service.SysLogService;
import com.visualplayer.dev.user.Repo.UserRepo;
import com.visualplayer.dev.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private SysLogService sysLogService;

    public User getUser(String username){
        return userRepo.findByUsername(username);
    }

    public void createUser(User user){
        userRepo.save(user);
        sysLogService.addSysLog(user,"创建账号 " + user.getUsername());
    }

}
