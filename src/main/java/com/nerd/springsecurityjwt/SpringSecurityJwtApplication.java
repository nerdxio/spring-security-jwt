package com.nerd.springsecurityjwt;

import com.nerd.springsecurityjwt.domain.Role;
import com.nerd.springsecurityjwt.domain.User;
import com.nerd.springsecurityjwt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_USER"));

            userService.saveUser(new User(null, "Hassan Refaat", "hassan", "password", new ArrayList<>()));
            userService.saveUser(new User(null, "Will Smith", "will", "password", new ArrayList<>()));
            userService.saveUser(new User(null, "Mo MO", "mo", "password", new ArrayList<>()));
            userService.saveUser(new User(null, "Abdo Ali", "abdo", "password", new ArrayList<>()));

            userService.addRoleToUser("hassan","ROLE_USER");
            userService.addRoleToUser("hassan","ROLE_MANGER");
            userService.addRoleToUser("will","ROLE_MANGER");
            userService.addRoleToUser("mo","ROLE_ADMIN");
            userService.addRoleToUser("abdo","ROLE_SUPER_USER");
            userService.addRoleToUser("abdo","ROLE_ADMIN");
            userService.addRoleToUser("abdo","ROLE_USER");
        };
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
