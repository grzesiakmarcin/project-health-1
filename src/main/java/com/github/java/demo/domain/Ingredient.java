package com.github.java.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String calories;
    @Column
    private Double protein;
    @Column
    private Double fats;
    @Column
    private Double carbs;
    @Column
    private Double salt;
    @Column
    private Double weight;
    @Column
    private String category;

    @ManyToMany
    Set<Meal> meals = new HashSet<>();


}
