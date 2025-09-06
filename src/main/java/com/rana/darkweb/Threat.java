package com.rana.darkweb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Threat {

    @Id
    private String threatId;
    private String threatType;
    private String description;
    private String sourceUrl;
    private String timestamp;
    private String severity;
    private String status;
    private String detectionMethod;

    // Getters and Setters
    public String getThreatId() { return threatId; }
    public void setThreatId(String threatId) { this.threatId = threatId; }

    public String getThreatType() { return threatType; }
    public void setThreatType(String threatType) { this.threatType = threatType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getSourceUrl() { return sourceUrl; }
    public void setSourceUrl(String sourceUrl) { this.sourceUrl = sourceUrl; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDetectionMethod() { return detectionMethod; }
    public void setDetectionMethod(String detectionMethod) { this.detectionMethod = detectionMethod; }
}
