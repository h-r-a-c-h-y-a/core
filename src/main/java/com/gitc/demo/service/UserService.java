package com.gitc.demo.service;

import com.gitc.demo.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUser(long id);
}
