package FlightControl.UI;

import java.util.Scanner;
import FlightControl.Domain.*;
import FlightControl.Logic.*;

public class UserInterface {

    private Scanner scanner;
    private AssetControl assetControl;
    
    public UserInterface(AssetControl assetControl, Scanner scanner) {
        this.assetControl = assetControl;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.println("Airport Asset Control");
            System.out.println("--------------------");
            System.out.println();

            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");

            String command = scanner.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                assetControl.addAirline(id, capacity);
            } else if (command.equals("2")) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String departure = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String target = scanner.nextLine();
                assetControl.addFlightInfo(id, departure, target);
            } else {
                continue;
            }
        }

        System.out.println("");

        while (true) {

            System.out.println("Flight Control");
            System.out.println("------------");
            System.out.println("");

            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String command = scanner.nextLine();
            
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                assetControl.printAirplane();
            } else if (command.equals("2")) {
                assetControl.printFlight();
            } else if (command.equals("3")) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                assetControl.searchFlight(id);
            } else {
                continue;
            }
        }

        
    }
}
