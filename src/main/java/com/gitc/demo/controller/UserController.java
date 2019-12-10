package com.gitc.demo.controller;

import com.gitc.demo.dto.UserDto;
import com.gitc.demo.mapper.UserMapper;
import com.gitc.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable Long id) {
        return userMapper.toDto(userService.getUser(id)
                .orElseThrow(RuntimeException::new));
    }
}
