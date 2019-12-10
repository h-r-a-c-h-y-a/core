package com.gitc.demo.dto;

import com.gitc.demo.model.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {

    private long id;
    private String name;


    public RoleDto(Role role){
        this.id = role.getId();
        this.name = role.getName();
    }
}
