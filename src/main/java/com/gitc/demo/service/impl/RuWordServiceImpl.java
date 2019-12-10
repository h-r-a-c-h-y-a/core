package com.gitc.demo.service.impl;

import com.gitc.demo.model.RuWord;
import com.gitc.demo.repository.RuWordRepository;
import com.gitc.demo.service.RuWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RuWordServiceImpl implements RuWordService {

    private final RuWordRepository repository;

    @Override
    public Optional<RuWord> getEnWord(long id) {
        return repository.getById(id);
    }
}
