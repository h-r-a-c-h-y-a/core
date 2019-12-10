package com.gitc.demo.dto;

import com.gitc.demo.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleDto {

    private String name;


    public RoleDto(Role role){
        this.name = role.getName();
    }
}
