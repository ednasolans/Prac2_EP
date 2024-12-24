package data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testVehicleID {
    public testVehicleID() {
    }

    @Test
    public void nullVehicleID() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID((String)null), "VehicleID mustn't be null");
    }

    @Test
    public void lessLengthID() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID("1"), "VehicleID length should be 6");
    }

    @Test
    public void moreLengthID() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID("1234567"), "StationID length should be 6");
    }

    @Test
    public void invalidIDFormat() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID("ABCDEF"), "Invalid Vehicle ID format. Format must be: {NNNNNN}, N for number");
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID("A12345"), "Invalid Vehicle ID format. Format must be: {NNNNNN}, N for number");
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID("AB12CD"), "Invalid Vehicle ID format. Format must be: {NNNNNN}, N for number");
    }

    @Test
    public void validID() {
        Assertions.assertDoesNotThrow(() -> new VehicleID("123456"), "Valid Vehicle, no exception expected");
    }

    @Test
    public void containsBlankSpace() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new VehicleID("AB 23"), "VehicleID can't contain blank space");
    }

}
