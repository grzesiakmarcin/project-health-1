package com.github.java.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Dietician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String password;
    @Column
    private String email;
    @Column(name = "licence_number")
    private String licenceNumber;
    @Column
    private String name;
    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "mainDoctor")
    Set<Client> clientSet = new HashSet<>();

}