package com.gitc.demo.controller;

import com.gitc.demo.dto.RuWordDto;
import com.gitc.demo.mapper.RuWordMapper;
import com.gitc.demo.service.RuWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RuWordController {

    private final RuWordService ruWordService;
    private final RuWordMapper ruWordMapper;

    @GetMapping("/ru-words/{id}")
    public RuWordDto getRuWord(@PathVariable Long id) {
        return ruWordMapper.toDto(ruWordService.getEnWord(id)
                .orElseThrow(RuntimeException::new));
    }
}
