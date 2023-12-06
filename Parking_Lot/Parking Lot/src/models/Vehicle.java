package models;

public class Vehicle {
    private int number;
    private VehicleTypes vehicleTypes;
    private String OwnerName;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
