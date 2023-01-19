package com.example.Incidentmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@Table(name = "SECTOR")
public class SECTOR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sector;

    @OneToMany(mappedBy = "sector")
    private List<Incident> incidents;

    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL)
    private List<Helper> helpers;

    @OneToMany(mappedBy = "sector",cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    private Collection<TYPE> Type;
}
