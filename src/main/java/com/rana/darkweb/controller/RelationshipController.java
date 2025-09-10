package com.rana.darkweb.controller;

import com.rana.darkweb.Relationship;
import com.rana.darkweb.repository.RelationshipRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relationships")
public class RelationshipController {

    private final RelationshipRepository relationshipRepository;

    public RelationshipController(RelationshipRepository relationshipRepository) {
        this.relationshipRepository = relationshipRepository;
    }

    @GetMapping
    public List<Relationship> getAllRelationships() {
        return relationshipRepository.findAll();
    }
}
