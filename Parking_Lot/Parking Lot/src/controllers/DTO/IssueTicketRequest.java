package controllers.DTO;

import models.VehicleTypes;

public class IssueTicketRequest {
    private VehicleTypes vehicleTypes;
    private String VehicleOwner;
    private String VehicleNumber;
    private Long gateId;

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(VehicleTypes vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public String getVehicleOwner() {
        return VehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        VehicleOwner = vehicleOwner;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
