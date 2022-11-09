package com.nerd.springsecurityjwt.repo;

import com.nerd.springsecurityjwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName (String name);
}
