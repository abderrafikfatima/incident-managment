package com.example.Incidentmanagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Entity
@Data
@Table(name= "incidents")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt = new Date();
    @Column(columnDefinition = "VARCHAR(4000)")
    private String description;

    private Float longitude;
    private Float latitude;
    private String state;
    private String status;
    @Column(columnDefinition = "VARCHAR(4000)")
    private String retroInfo;
    @Column(columnDefinition = "VARCHAR(4000)")
    private String photo;
    private String sector;
    private String type;
    private String province;


//    @ManyToOne
//    @JoinColumn(name = "type_id")
//    private TYPE ty;
//    @ManyToOne
//    @JoinColumn(name = "sector_id")
//    private SECTOR sec;
//
//    @ManyToOne
//    @JoinColumn(name = "province_id")
//    private PROVINCE pro;
//


//    @ManyToOne
//    private Helper helper;
//

}
