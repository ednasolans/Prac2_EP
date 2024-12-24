package data;

public class VehicleID {
    private final String vehicleID;

    public VehicleID(String vehicleID) {
        if (vehicleID == null) {
            throw new IllegalArgumentException("Station ID cannot be null.");
        } else if (vehicleID.length() != 6) {
            throw new IllegalArgumentException("Station ID must have exactly 6 characters.");
        } else if (!vehicleID.matches("[0-9]{6}")) {
            throw new IllegalArgumentException("Invalid Station ID format. Format must be: {LLNNN}, L for letter, N for number.");
        } else if (vehicleID.contains(" ")) {
            throw new IllegalArgumentException("Station ID cannot contain blank spaces.");
        } else {
            this.vehicleID = vehicleID;
        }
    }

    public String getStationID() {
        return this.vehicleID;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            VehicleID that = (VehicleID)o;
            return this.vehicleID.equals(that.vehicleID);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.vehicleID.hashCode();
    }

    public String toString() {
        return "StationID{stationID='" + this.vehicleID + "'}";
    }
}
