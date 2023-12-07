package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Speaker extends Participant {
    private String expertise;

    @OneToOne
    @JoinColumn(name = "participant_id")
    private Participant participant;
}
