package com.visualplayer.dev.sys.syslog.service;

import com.visualplayer.dev.sys.syslog.bean.SysLog;
import com.visualplayer.dev.sys.syslog.repo.SysLogRepo;
import com.visualplayer.dev.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLogService {

    @Autowired
    private SysLogRepo sysLogRepo;

    public SysLog addSysLog(User user,String describe){
        return this.addSysLog(user.getUsername(),describe);
    }

    public SysLog addSysLog(String operator,String describe){
        SysLog log = new SysLog(operator,describe);
        sysLogRepo.save(log);
        return log;
    }

}
