package com.rana.darkweb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Indicator {

    @Id
    private String indicatorId;
    private String indicatorType;
    private String indicatorValue;
    private String associatedThreats;
    private String confidence;
    private String lastSeen;

    // Getters and Setters
    public String getIndicatorId() { return indicatorId; }
    public void setIndicatorId(String indicatorId) { this.indicatorId = indicatorId; }

    public String getIndicatorType() { return indicatorType; }
    public void setIndicatorType(String indicatorType) { this.indicatorType = indicatorType; }

    public String getIndicatorValue() { return indicatorValue; }
    public void setIndicatorValue(String indicatorValue) { this.indicatorValue = indicatorValue; }

    public String getAssociatedThreats() { return associatedThreats; }
    public void setAssociatedThreats(String associatedThreats) { this.associatedThreats = associatedThreats; }

    public String getConfidence() { return confidence; }
    public void setConfidence(String confidence) { this.confidence = confidence; }

    public String getLastSeen() { return lastSeen; }
    public void setLastSeen(String lastSeen) { this.lastSeen = lastSeen; }
}
