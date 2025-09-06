package com.rana.darkweb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Relationship {

    @Id
    private String relationshipId; // optional, you can create unique ID
    private String sourceId;
    private String sourceType;
    private String targetId;
    private String targetType;
    private String relationshipType;
    private String timestamp;
    private String context;

    // Getters and Setters
    public String getRelationshipId() { return relationshipId; }
    public void setRelationshipId(String relationshipId) { this.relationshipId = relationshipId; }

    public String getSourceId() { return sourceId; }
    public void setSourceId(String sourceId) { this.sourceId = sourceId; }

    public String getSourceType() { return sourceType; }
    public void setSourceType(String sourceType) { this.sourceType = sourceType; }

    public String getTargetId() { return targetId; }
    public void setTargetId(String targetId) { this.targetId = targetId; }

    public String getTargetType() { return targetType; }
    public void setTargetType(String targetType) { this.targetType = targetType; }

    public String getRelationshipType() { return relationshipType; }
    public void setRelationshipType(String relationshipType) { this.relationshipType = relationshipType; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

    public String getContext() { return context; }
    public void setContext(String context) { this.context = context; }
}
