package com.visualplayer.dev.sys.syslog.repo;

import com.visualplayer.dev.sys.syslog.bean.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysLogRepo extends JpaRepository<SysLog,Long> {
}
