package com.github.java.demo.domain;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "patients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String password;
    @Column
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private LocalDate birthDate;
    @Column(name = "gender")
    private String gender;
    @Column
    private String affections;

    @ManyToOne
    private Dietician mainDoctor;

    @OneToMany(mappedBy = "client")
    private Set<Progress> progressSet = new HashSet<>();

}
