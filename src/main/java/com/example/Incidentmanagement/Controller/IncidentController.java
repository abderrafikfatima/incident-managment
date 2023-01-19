package com.example.Incidentmanagement.Controller;

import com.example.Incidentmanagement.Entity.Incident;
import com.example.Incidentmanagement.Service.Incident.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class IncidentController {
    @Autowired
    private IncidentService incidentService;

    @GetMapping("/incidents")
    public List<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }

    @GetMapping("/incidents/{id}")
    public Incident getIncidentById(@PathVariable Long id) {
        return incidentService.getIncidentById(id);
    }

    @PostMapping("/incidents")
    public Incident createIncident(@RequestBody Incident incident){
        return incidentService.addIncident(incident);
    }

    @PutMapping("/incidents/{id}")
    public Incident updateIncident(@PathVariable Long id, @RequestBody Incident incident){
        return incidentService.updateIncident(id, incident);
    }

    @DeleteMapping("/incidents/{id}")
    public String deleteIncident(@PathVariable Long id){
        return incidentService.deleteIncident(id);
    }

}

