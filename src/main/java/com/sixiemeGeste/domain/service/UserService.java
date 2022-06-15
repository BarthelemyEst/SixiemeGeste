package com.sixiemeGeste.domain.service;

import com.sixiemeGeste.application.DTO.UserDTO;
import com.sixiemeGeste.application.port.UserServicePort;
import com.sixiemeGeste.domain.model.User;
import com.sixiemeGeste.domain.port.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements UserServicePort {
    private final UserRepositoryPort userRepositoryPort;
    private final ModelMapper modelMapper;

    @Override
    public User saveUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return this.userRepositoryPort.saveUser(user);
    }

    @Override
    public List<User> getUsers() {
        return this.userRepositoryPort.findAll();
    }

    @Override
    public User getUserByUsernameOrEmail(String email, String username) {
        return this.userRepositoryPort.getUserByUsernameOrEmail(email, username);
    }

}
