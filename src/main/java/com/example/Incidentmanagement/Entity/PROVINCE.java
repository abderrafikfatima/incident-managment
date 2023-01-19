package com.example.Incidentmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "province")
public class PROVINCE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true,nullable = false)
    private Long  id;
    @Column(name = "province", unique = true,nullable = false)
    private String province;
    private Float area;
}
