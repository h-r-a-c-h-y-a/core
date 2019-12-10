package com.gitc.demo.service;

import com.gitc.demo.model.RuWord;

import java.util.Optional;

public interface RuWordService {

    Optional<RuWord> getEnWord(long id);
}
