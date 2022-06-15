package com.sixiemeGeste.infrastructure.DAO;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class UserDAO {
    @Id
    private String userId;

    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;

    private String firstName;
    private String lastName;

    private Date dob;
}
