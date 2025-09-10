package com.rana.darkweb.controller;

import com.rana.darkweb.Actor;
import com.rana.darkweb.repository.ActorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}
