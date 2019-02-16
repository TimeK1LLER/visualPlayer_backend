package com.visualplayer.dev.sys.syslog.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class SysLog {

    @Id
    @GeneratedValue
    Long slid;

    @Column
    Date operateTime;

    @Column
    String operateUserName;

    @Column
    String operateDescribe;

    public SysLog(String username,String describe){
        this.operateUserName = username;
        this.operateDescribe = describe;
        this.operateTime = new Date();
    }

}
