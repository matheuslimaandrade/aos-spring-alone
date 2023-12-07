package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Speaker extends Participant {
    private String expertise;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "participant_id")
    private Participant participant;
}
