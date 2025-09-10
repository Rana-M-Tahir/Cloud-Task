package com.rana.darkweb.controller;

import com.rana.darkweb.Threat;
import com.rana.darkweb.repository.ThreatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/threats")
public class ThreatController {

    private final ThreatRepository threatRepository;

    public ThreatController(ThreatRepository threatRepository) {
        this.threatRepository = threatRepository;
    }

    @GetMapping
    public List<Threat> getAllThreats() {
        return threatRepository.findAll();
    }
}
