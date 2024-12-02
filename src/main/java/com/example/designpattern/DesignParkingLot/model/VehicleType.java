package com.example.designpattern.DesignParkingLot.model;

public enum VehicleType {
    
    CAR("Car"),
    TRUCK("Truck"),
    ELECTRIC("Electric Car"),
    VAN("Van"),
    MOTORBIKE("Motorbike");

    private String description;

    VehicleType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean canFitInSpot(ParkingSpotType spotType) {
        switch (this) {
            case TRUCK:
            case VAN:
                return spotType == ParkingSpotType.LARGE;
            case MOTORBIKE:
                return spotType == ParkingSpotType.MOTORBIKE;
            case CAR:
                return spotType == ParkingSpotType.COMPACT || spotType == ParkingSpotType.LARGE;
            case ELECTRIC:
                return spotType == ParkingSpotType.ELECTRIC || spotType == ParkingSpotType.COMPACT || spotType == ParkingSpotType.LARGE;
            default:
                return false;
        }
    }
}
