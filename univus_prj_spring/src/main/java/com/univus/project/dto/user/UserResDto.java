package com.univus.project.dto.user;

import com.univus.project.constant.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResDto {
    private Long id;
    private String name;
    private String email;
    private String image;
    private Role role;
}
