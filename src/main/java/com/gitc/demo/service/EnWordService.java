package com.gitc.demo.service;

import com.gitc.demo.model.EnWord;

import java.util.Optional;

public interface EnWordService {

    Optional<EnWord> getEnWord(long id);
}
