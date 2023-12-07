package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String role;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}
