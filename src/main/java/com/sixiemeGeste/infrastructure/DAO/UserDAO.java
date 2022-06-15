package com.sixiemeGeste.infrastructure.DAO;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class UserDAO {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String userId;

    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;

    private String firstName;
    private String lastName;

    private Date dob;

    public UserDAO(String userId) {
        this.userId = userId;
    }
}
