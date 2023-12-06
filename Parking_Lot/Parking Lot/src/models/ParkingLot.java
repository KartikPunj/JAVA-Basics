package models;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private List<VehicleTypes> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;
    private FeeCalculatorStrategyType feeCalculatorStrategyType;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
        return spotAssignmentStrategyType;
    }

    public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
    }

    public FeeCalculatorStrategyType getFeeCalculatorStrategyType() {
        return feeCalculatorStrategyType;
    }

    public void setFeeCalculatorStrategyType(FeeCalculatorStrategyType feeCalculatorStrategyType) {
        this.feeCalculatorStrategyType = feeCalculatorStrategyType;
    }
}
