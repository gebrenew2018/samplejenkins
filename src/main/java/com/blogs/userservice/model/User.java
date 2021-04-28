package com.blogs.userservice.model;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}
