package com.visualplayer.dev.user.service;

import com.visualplayer.dev.user.Repo.UserRepo;
import com.visualplayer.dev.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUser(String username){
        return userRepo.findByUsername(username);
    }

}
