package com.gitc.demo.service;

import com.gitc.demo.model.Card;

import java.util.Optional;

public interface CardService {

    Optional<Card> getCard(long id);
}
