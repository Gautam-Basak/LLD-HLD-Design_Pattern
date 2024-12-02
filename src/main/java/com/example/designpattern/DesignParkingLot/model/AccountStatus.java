package com.example.designpattern.DesignParkingLot.model;

public enum AccountStatus {
    
    ACTIVE("Active"),
    BLOCKED("Blocked"),
    BANNED("Banned"),
    COMPROMISED("Compromised"),
    ARCHIVED("Archived"),
    UNKNOWN("Unknown");

    private String description;

    AccountStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAccountActive() {
        return this == ACTIVE;
    }
}
