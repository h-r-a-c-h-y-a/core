package com.gitc.demo.service.impl;

import com.gitc.demo.model.EnWord;
import com.gitc.demo.repository.EnWordRepository;
import com.gitc.demo.service.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService {

    private final EnWordRepository repository;

    @Override
    public Optional<EnWord> getEnWord(long id) {
        return repository.getById(id);
    }
}
