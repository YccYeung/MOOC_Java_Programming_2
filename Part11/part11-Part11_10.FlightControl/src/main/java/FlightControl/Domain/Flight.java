package FlightControl.Domain;

public class Flight {
    
    private String id;
    private String departureID;
    private String targetID;
    private int capacity;

    public Flight(String id, String departureID, String targetID, int capacity) {
        this.id = id;
        this.departureID = departureID;
        this.targetID = targetID;
        this.capacity = capacity;
    }

    public String getID() {
        return this.id;
    }

    public String getDepartureID() {
        return this.departureID;
    }

    public String getTargetID() {
        return this.targetID;
    }

    public int getCapacity() {
        return this.capacity;
    }

     public String toString() {
        return this.id + " (" + this.capacity + " capacity)" + " (" + this.departureID + "-" + this.targetID + ")";
    }
    
}
