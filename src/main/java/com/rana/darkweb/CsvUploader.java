package com.rana.darkweb;

import com.rana.darkweb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class CsvUploader implements CommandLineRunner {

    @Autowired
    private ThreatRepository threatRepository;

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private IndicatorRepository indicatorRepository;

    @Autowired
    private VulnerabilityRepository vulnerabilityRepository;

    @Autowired
    private RelationshipRepository relationshipRepository;

    @Override
    public void run(String... args) throws Exception {
        uploadThreats("C:\\Users\\User\\Downloads\\Darkweb_dataset\\synthetic_threats.csv");
        uploadActors("C:\\Users\\User\\Downloads\\Darkweb_dataset\\synthetic_actors.csv");
        uploadIndicators("C:\\Users\\User\\Downloads\\Darkweb_dataset\\synthetic_indicators.csv");
        uploadVulnerabilities("C:\\Users\\User\\Downloads\\Darkweb_dataset\\synthetic_vulnerabilities.csv");
        uploadRelationships("C:\\Users\\User\\Downloads\\Darkweb_dataset\\synthetic_relationships.csv");
        System.out.println("All CSV files uploaded successfully!");
    }

    private void uploadThreats(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                Threat threat = new Threat();
                threat.setThreatId(data[0]);
                threat.setThreatType(data[1]);
                threat.setDescription(data[2]);
                threat.setSourceUrl(data[3]);
                threat.setTimestamp(data[4]);
                threat.setSeverity(data[5]);
                threat.setStatus(data[6]);
                threat.setDetectionMethod(data[7]);
                threatRepository.save(threat);
            }
        }
    }

    private void uploadActors(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                Actor actor = new Actor();
                actor.setActorId(data[0]);
                actor.setActorName(data[1]);
                actor.setMotivation(data[2]);
                actor.setOrigin(data[3]);
                actor.setTactics(data[4]);
                actor.setTargets(data[5]);
                actorRepository.save(actor);
            }
        }
    }

    private void uploadIndicators(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                Indicator indicator = new Indicator();
                indicator.setIndicatorId(data[0]);
                indicator.setIndicatorType(data[1]);
                indicator.setIndicatorValue(data[2]);
                indicator.setAssociatedThreats(data[3]);
                indicator.setConfidence(data[4]);
                indicator.setLastSeen(data[5]);
                indicatorRepository.save(indicator);
            }
        }
    }

    private void uploadVulnerabilities(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                Vulnerability vulnerability = new Vulnerability();
                vulnerability.setVulnerabilityId(data[0]);
                vulnerability.setCveId(data[1]);
                vulnerability.setDescription(data[2]);
                vulnerability.setAssociatedProducts(data[3]);
                vulnerability.setCvssScore(data[4]);
                vulnerability.setExploitAvailable(data[5]);
                vulnerabilityRepository.save(vulnerability);
            }
        }
    }

    private void uploadRelationships(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Skip header
            int counter = 1;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                Relationship relationship = new Relationship();
                relationship.setRelationshipId("REL_" + counter++);
                relationship.setSourceId(data[0]);
                relationship.setSourceType(data[1]);
                relationship.setTargetId(data[2]);
                relationship.setTargetType(data[3]);
                relationship.setRelationshipType(data[4]);
                relationship.setTimestamp(data[5]);
                relationship.setContext(data[6]);
                relationshipRepository.save(relationship);
            }
        }
    }
}
