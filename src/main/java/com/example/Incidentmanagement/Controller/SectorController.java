package com.example.Incidentmanagement.Controller;

import com.example.Incidentmanagement.Entity.SECTOR;
import com.example.Incidentmanagement.Service.Sector.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SectorController {

    @Autowired
    public SectorService sectorService;

    @PostMapping("/sectors")
    public SECTOR createSector(SECTOR sector){
        return sectorService.addSector(sector);
    }
}
