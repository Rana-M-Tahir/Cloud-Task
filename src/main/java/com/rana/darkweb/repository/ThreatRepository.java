package com.rana.darkweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rana.darkweb.Threat;

@Repository
public interface ThreatRepository extends JpaRepository<Threat, String> {
}
