package com.example.Incidentmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "TYPE")
public class TYPE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @OneToMany(mappedBy = "type")
    private List<Incident> incidents;
    @ManyToOne
    private SECTOR sector;

}
