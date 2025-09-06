package com.rana.darkweb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {

    @Id
    private String actorId;
    private String actorName;
    private String motivation;
    private String origin;
    private String tactics;
    private String targets;

    // Getters and Setters
    public String getActorId() { return actorId; }
    public void setActorId(String actorId) { this.actorId = actorId; }

    public String getActorName() { return actorName; }
    public void setActorName(String actorName) { this.actorName = actorName; }

    public String getMotivation() { return motivation; }
    public void setMotivation(String motivation) { this.motivation = motivation; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getTactics() { return tactics; }
    public void setTactics(String tactics) { this.tactics = tactics; }

    public String getTargets() { return targets; }
    public void setTargets(String targets) { this.targets = targets; }
}
