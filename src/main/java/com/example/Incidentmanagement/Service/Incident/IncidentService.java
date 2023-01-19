package com.example.Incidentmanagement.Service.Incident;

import com.example.Incidentmanagement.Entity.Incident;

import java.util.List;

public interface IncidentService {
    List<Incident> getAllIncidents();

    Incident getIncidentById(Long id);

    Incident addIncident(Incident incident);

    Incident updateIncident(Long id, Incident incident);

    String deleteIncident(Long id);
}
