package com.gitc.demo.controller;

import com.gitc.demo.dto.CardDto;
import com.gitc.demo.dto.EnWordDto;
import com.gitc.demo.mapper.CardMapper;
import com.gitc.demo.mapper.EnWordMapper;
import com.gitc.demo.service.CardService;
import com.gitc.demo.service.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDto getCard(@PathVariable Long id) {
        return cardMapper.toDto(cardService.getCard(id)
                .orElseThrow(RuntimeException::new));
    }
}
