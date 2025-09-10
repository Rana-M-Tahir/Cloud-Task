package com.rana.darkweb.controller;

import com.rana.darkweb.Indicator;
import com.rana.darkweb.repository.IndicatorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/indicators")
public class IndicatorController {

    private final IndicatorRepository indicatorRepository;

    public IndicatorController(IndicatorRepository indicatorRepository) {
        this.indicatorRepository = indicatorRepository;
    }

    @GetMapping
    public List<Indicator> getAllIndicators() {
        return indicatorRepository.findAll();
    }
}
