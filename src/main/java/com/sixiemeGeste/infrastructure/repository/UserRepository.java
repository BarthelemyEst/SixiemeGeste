package com.sixiemeGeste.infrastructure.repository;

import com.sixiemeGeste.infrastructure.DAO.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<UserDAO, Long>, JpaSpecificationExecutor<UserDAO> {
    UserDAO findUserDAOByEmailOrUsername(String email, String username);
}
