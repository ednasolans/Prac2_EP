package micromobility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testPMVehicle {

    @Test
    public void testInitialState() {
        PMVehicle vehicle = new PMVehicle();
        assertEquals(PMVState.Available, vehicle.getState(), "Initial state should be Available");
    }

    @Test
    public void testSetNotAvailb() {
        PMVehicle vehicle = new PMVehicle();
        vehicle.setNotAvailb();
        assertEquals(PMVState.NotAvailable, vehicle.getState(), "State should be NotAvailable after setNotAvailb");
    }

    @Test
    public void testSetUnderWay() {
        PMVehicle vehicle = new PMVehicle();
        vehicle.setUnderWay();
        assertEquals(PMVState.UnderWay, vehicle.getState(), "State should be UnderWay after setUnderWay");
    }

    @Test
    public void testSetAvailb() {
        PMVehicle vehicle = new PMVehicle();
        vehicle.setNotAvailb(); // Change state first
        vehicle.setAvailb();
        assertEquals(PMVState.Available, vehicle.getState(), "State should be Available after setAvailb");
    }

//    @Test
//    public void testSetLocation() {
//        PMVehicle vehicle = new PMVehicle();
//        data.GeographicPoint location = new data.GeographicPoint(41.3851f, 2.1734f); // Example coordinates for Barcelona
//        vehicle.setLocation(location);
//        assertEquals(location, vehicle.getLocation(), "Location should be updated correctly");
//    }

    @Test
    public void testGetLocationInitial() {
        PMVehicle vehicle = new PMVehicle();
        assertNull(vehicle.getLocation(), "Initial location should be null");
    }
}
