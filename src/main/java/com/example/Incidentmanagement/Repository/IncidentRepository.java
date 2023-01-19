package com.example.Incidentmanagement.Repository;


import com.example.Incidentmanagement.Entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident,Long> {
}
