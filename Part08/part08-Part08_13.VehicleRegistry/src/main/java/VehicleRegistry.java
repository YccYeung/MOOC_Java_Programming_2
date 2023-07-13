import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicle;

    public VehicleRegistry() {
        this.vehicle = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicle.get(licensePlate) == null) {
            vehicle.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.vehicle.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicle.get(licensePlate) != null) {
            this.vehicle.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (Map.Entry<LicensePlate, String> i : vehicle.entrySet()) {
            System.out.println(i.getKey());
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<LicensePlate, String> i : vehicle.entrySet()) {
            if (!list.contains(i.getValue())) {
                list.add(i.getValue());
            }
                
        }

        for (String i : list) {
            System.out.println(i);
        }




    }
}
