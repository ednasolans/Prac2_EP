package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testStationID {

    @Test
    public void nullStationID() {
        assertThrows(IllegalArgumentException.class, () -> new StationID(null), "StationID mustn't be null");
    }

    @Test
    public void lessLengthID() {
        assertThrows(IllegalArgumentException.class, () -> new StationID("A"), "StationID length should be 5");
    }

    @Test
    public void moreLengthID() {
        assertThrows(IllegalArgumentException.class, () -> new StationID("AB1234"), "StationID length should be 5");
    }

    @Test
    public void invalidIDFormat() {
        assertThrows(IllegalArgumentException.class, () -> new StationID("123AB"), "Invalid Station ID format. Format must be: {LLNNN}, L for letter, N for number");
        assertThrows(IllegalArgumentException.class, () -> new StationID("A123B"), "Invalid Station ID format. Format must be: {LLNNN}, L for letter, N for number");
        assertThrows(IllegalArgumentException.class, () -> new StationID("12345"), "Invalid Station ID format. Format must be: {LLNNN}, L for letter, N for number");
        assertThrows(IllegalArgumentException.class, () -> new StationID("ABCDE"), "Invalid Station ID format. Format must be: {LLNNN}, L for letter, N for number");
    }

    @Test
    public void validID() {
        assertDoesNotThrow(() -> new StationID("AB123"), "Valid StationID, no exception expected");
    }

    @Test
    public void containsBlankSpace() {
        assertThrows(IllegalArgumentException.class, () -> new StationID("AB 23"), "StationID can't contain blank space");
    }
}