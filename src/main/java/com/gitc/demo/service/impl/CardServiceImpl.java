package com.gitc.demo.service.impl;

import com.gitc.demo.model.Card;
import com.gitc.demo.repository.CardRepository;
import com.gitc.demo.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository repository;

    @Override
    public Optional<Card> getCard(long id) {
        return repository.getById(id);
    }
}
