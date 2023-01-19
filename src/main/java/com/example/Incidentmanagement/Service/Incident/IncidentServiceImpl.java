package com.example.Incidentmanagement.Service.Incident;

import com.example.Incidentmanagement.Entity.Incident;
import com.example.Incidentmanagement.Repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {

    @Autowired
    IncidentRepository incidentRepository;


    @Override
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    @Override
    public Incident getIncidentById(Long id) {
        Incident incident = incidentRepository.findById(id).get();
        return incident;
    }

    @Override
    public Incident addIncident(Incident incident) {
        incidentRepository.save(incident);
        return incident;
    }

    @Override
    public Incident updateIncident(Long id, Incident incident) {
        incidentRepository.findById(id).get();
        incident.setCreatedAt(incident.getCreatedAt());
        incident.setDescription(incident.getDescription());
        incident.setPhoto(incident.getPhoto());
        incident.setLatitude(incident.getLatitude());
        incident.setLongitude(incident.getLongitude());
        incident.setProvince(incident.getProvince());
        incident.setRetroInfo(incident.getRetroInfo());
        incident.setSector(incident.getSector());
        incident.setState(incident.getState());
        incident.setStatus(incident.getStatus());
        incident.setType(incident.getType());

        incidentRepository.save(incident);
        return incident;

    }

    @Override
    public String deleteIncident(Long id) {
        Boolean exists = incidentRepository.existsById(id);

        if (exists){
            incidentRepository.deleteById(id);
            return "Incident was deleted with id : " + " " + id;
        }

        return "Incident doesn't exist";
    }
}
