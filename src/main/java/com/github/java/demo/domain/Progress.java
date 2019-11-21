package com.github.java.demo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private LocalDate date;
    @Column
    private Double weight;
    @Column
    private Double height;
    @Column(name = "target_weight")
    private Double targerWeight;
    @Column
    private String commentary;

    @ManyToOne
    private Client client;

}
