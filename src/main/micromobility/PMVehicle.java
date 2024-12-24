package micromobility;
/**
 * Internal classes involved in the use of the service
 */

public class PMVehicle {

    private PMVState state;
    private data.GeographicPoint location;

    public PMVehicle() {
        this.state = PMVState.Available;
    }

    public PMVState getState() {
        return state;
    }

    public data.GeographicPoint getLocation() {
        return location;
    }

    public void setNotAvailb() {
        this.state = PMVState.NotAvailable;
    }

    public void setUnderWay() {
        this.state = PMVState.UnderWay;
    }

    public void setAvailb() {
        this.state = PMVState.Available;
    }

    public void setLocation(data.GeographicPoint location) {
        this.location = location;

    }
}