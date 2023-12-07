package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Speaker extends Participant {
    private String expertise;
}
