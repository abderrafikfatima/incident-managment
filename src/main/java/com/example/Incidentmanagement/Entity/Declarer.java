package com.example.Incidentmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "declarers")
public class Declarer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String IME;
    @Column(unique = true)
    private String email;
    private String password;

    @OneToMany
    private List<Incident> incidents;
}
