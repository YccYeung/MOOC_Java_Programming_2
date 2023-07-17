package FlightControl.Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import FlightControl.Domain.Airline;
import FlightControl.Domain.Flight;

public class AssetControl {

    private List<Airline> airlineInfo;
    private List<Flight> flightInfo;
    private Map<String, Integer> detailInfo;

    public AssetControl() {
        this.airlineInfo = new ArrayList<>();
        this.flightInfo = new ArrayList<>();
        this.detailInfo = new HashMap<>();
    }

    public void addAirline(String id, int capacity) {
        this.airlineInfo.add(new Airline(id, capacity));
        this.detailInfo.put(id, capacity);
    }

    public void addFlightInfo(String id, String departureID, String targetID) {
        if (this.detailInfo.containsKey(id)) {
            this.flightInfo.add(new Flight(id, departureID, targetID, this.detailInfo.get(id)));
        } 
    }

    public void printAirplane() {
        for (Airline airline : this.airlineInfo) {
            System.out.println(airline);
        }
    }

    public void printFlight() {
        for (Flight flight : this.flightInfo) {
            System.out.println(flight.toString());
        }
    }

    public void searchFlight(String id) {
        for (Airline airline : this.airlineInfo) {
            if (id.equals(airline.getID())) {
                System.out.println(airline);
            }
        }
    }
}

