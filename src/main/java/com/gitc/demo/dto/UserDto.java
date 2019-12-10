package com.gitc.demo.dto;

import com.gitc.demo.model.Role;
import com.gitc.demo.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private long id;
    private String email;
    private Set<RoleDto> roles = new HashSet<>();

    public UserDto(User user){
        this.email = user.getEmail();
        this.id = user.getId();
        user.getRoles()
                .forEach(role -> roles.add(
                        new RoleDto(role)));
    }
}
