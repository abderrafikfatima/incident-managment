package com.example.Incidentmanagement.Service.Sector;

import com.example.Incidentmanagement.Entity.SECTOR;
import com.example.Incidentmanagement.Repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SectorService {

    public SECTOR addSector(SECTOR sector );

    public List<SECTOR> findAllSectors() ;

    public SECTOR findSectorByID(Long id);
}
