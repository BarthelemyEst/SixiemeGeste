package com.sixiemeGeste.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userId;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private Date dob;
    private String password;
}
