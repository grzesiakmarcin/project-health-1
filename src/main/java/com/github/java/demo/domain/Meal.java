package com.github.java.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @ManyToMany(mappedBy = "meals")
    Set<Ingredient> ingredients = new HashSet<>();
    @Column
    private String recipt;
}
