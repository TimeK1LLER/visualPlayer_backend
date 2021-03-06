package com.visualplayer.dev.user.Repo;

import com.visualplayer.dev.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    public User findByUsername(String username);

}
