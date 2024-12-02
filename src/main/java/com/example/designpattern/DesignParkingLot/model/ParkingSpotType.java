package com.example.designpattern.DesignParkingLot.model;

public enum ParkingSpotType {

    HANDICAPPED("Handicapped"),
    COMPACT("Compact"),
    LARGE("Large"),
    MOTORBIKE("Motorbike"),
    ELECTRIC("Electric Charging");

    private String displayName;

    ParkingSpotType(String parkingSpot) {
        this.displayName = parkingSpot;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isSuitableFor(VehicleType vehicleType){
        return vehicleType.canFitInSpot(this);
    }
}
