package com.sixiemeGeste.application.port;

import com.sixiemeGeste.application.DTO.UserDTO;
import com.sixiemeGeste.domain.model.User;

import java.util.List;

public interface UserServicePort {
    User saveUser(UserDTO userDTO);

    List<User> getUsers();

    User getUserByUsernameOrEmail(String email, String username);
}
