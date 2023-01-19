package com.example.Incidentmanagement.Service.Sector;

import com.example.Incidentmanagement.Entity.SECTOR;
import com.example.Incidentmanagement.Repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorServiceImpl implements SectorService{

    @Autowired
    SectorRepository sectorRepository;


    @Override
    public SECTOR addSector(SECTOR sector) {
        sectorRepository.save(sector);
        return sector;
    }

    @Override
    public List<SECTOR> findAllSectors() {
        return sectorRepository.findAll();
    }

    @Override
    public SECTOR findSectorByID(Long id) {
        return sectorRepository.findById(id).get();
    }
}
