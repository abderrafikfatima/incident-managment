package com.example.Incidentmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.context.config.InactiveConfigDataAccessException;

import java.util.List;

@Entity
@Data
@Table(name = "helpers")
public class Helper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String sector;
    private String province;

//    @OneToMany(mappedBy = "helper")
//    private List<Incident> incidents;
}
