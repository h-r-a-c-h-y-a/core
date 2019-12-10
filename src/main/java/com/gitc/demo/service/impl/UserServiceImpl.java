package com.gitc.demo.service.impl;

import com.gitc.demo.model.User;
import com.gitc.demo.repository.UserRepository;
import com.gitc.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public Optional<User> getUser(long id) {
        return repository.getById(id);
    }
}
