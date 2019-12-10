package com.gitc.demo.controller;

import com.gitc.demo.dto.EnWordDto;
import com.gitc.demo.dto.UserDto;
import com.gitc.demo.mapper.EnWordMapper;
import com.gitc.demo.mapper.UserMapper;
import com.gitc.demo.service.EnWordService;
import com.gitc.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDto getEnWord(@PathVariable Long id) {
        return enWordMapper.toDto(enWordService.getEnWord(id)
                .orElseThrow(RuntimeException::new));
    }
}
