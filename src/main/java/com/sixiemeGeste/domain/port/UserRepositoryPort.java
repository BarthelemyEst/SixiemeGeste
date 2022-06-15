package com.sixiemeGeste.domain.port;

import com.sixiemeGeste.domain.model.User;

import java.util.List;

public interface UserRepositoryPort {
    User saveUser(User user);

    List<User> findAll();

    User getUserByUsernameOrEmail(String email, String username);
}
