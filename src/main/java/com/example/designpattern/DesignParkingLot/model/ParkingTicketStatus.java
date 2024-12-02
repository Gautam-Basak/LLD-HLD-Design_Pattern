package com.example.designpattern.DesignParkingLot.model;

public enum ParkingTicketStatus {

    ACTIVE("Ticket Active"),
    PAID("Ticket Paid"),
    LOST("Ticket Lost");

    private String description;

    ParkingTicketStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPaid() {
        return this == PAID;
    }
}
