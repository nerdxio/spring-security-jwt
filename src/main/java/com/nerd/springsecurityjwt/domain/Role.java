package com.nerd.springsecurityjwt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "spring_user_role")
public class Role {
    @Id
    @SequenceGenerator(
            name = "spring_user_role_sequence",
            sequenceName = "spring_user_role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "spring_user_role_sequence"
    )
    private Long id;
    private String name;

}
