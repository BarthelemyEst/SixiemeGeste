package com.sixiemeGeste.infrastructure.adapter;

import com.sixiemeGeste.domain.model.User;
import com.sixiemeGeste.domain.port.UserRepositoryPort;
import com.sixiemeGeste.infrastructure.DAO.UserDAO;
import com.sixiemeGeste.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class UserRepositoryAdapter implements UserRepositoryPort {
    private UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public User saveUser(User user) {
        UserDAO userDAO = modelMapper.map(user, UserDAO.class);
        return modelMapper.map(this.userRepository.save(userDAO), User.class);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll()
                .stream().map(userDAO -> modelMapper.map(userDAO, User.class))
                .collect(Collectors.toList());
    }

    @Override
    public User getUserByUsernameOrEmail(String email, String username) {
        if (this.userRepository.findUserDAOByEmailOrUsername(email, username) == null) {
            return null;
        }
        return modelMapper.map(this.userRepository.findUserDAOByEmailOrUsername(email, username), User.class);
    }
}
