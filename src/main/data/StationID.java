package data;

final public class StationID {
    // The StationID format is: {letter, letter, number, number, number}
    // First letter is the initial of the country where the station is located
    // Second letter is the initial of the city where the station is located

    private final String stationID;

    public StationID(String stationID) {
        if (stationID == null) {
            throw new IllegalArgumentException("Station ID cannot be null.");
        }

        if (stationID.length() != 5) {
            throw new IllegalArgumentException("Station ID must have exactly 5 characters.");
        }

        if (!stationID.matches("[A-Za-z]{2}[0-9]{3}")) {
            // [A-Za-z] {2} Any letter (uppercase o lowercase), exactly 2 of them
            // [0-9] {3} Any number from 0 to 9, exactly 3 of them
            throw new IllegalArgumentException("Invalid Station ID format. Format must be: {LLNNN}, L for letter, N for number.");
        }

        if (stationID.contains(" ")) {
            throw new IllegalArgumentException("Station ID cannot contain blank spaces.");
        }

        this.stationID = stationID;
    }

    public String getStationID() {
        return stationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationID that = (StationID) o;
        return stationID.equals(that.stationID);
    }

    @Override
    public int hashCode () {
        return stationID.hashCode();
    }


    @Override
    public String toString() {
        return "StationID{" + "stationID='" + stationID + '\'' + '}';
    }
}
