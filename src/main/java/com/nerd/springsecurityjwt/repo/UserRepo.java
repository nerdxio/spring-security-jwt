package com.nerd.springsecurityjwt.repo;

import com.nerd.springsecurityjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername (String username);
}
