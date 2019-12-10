package com.gitc.demo.controller;

import com.gitc.demo.dto.RoleDto;
import com.gitc.demo.dto.UserDto;
import com.gitc.demo.model.Role;
import com.gitc.demo.model.User;
import com.gitc.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable Long id){
        return new UserDto(userService.getUser(id).orElseThrow(RuntimeException::new));
    }
}
