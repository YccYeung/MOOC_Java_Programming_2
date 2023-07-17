package FlightControl;

import java.util.Scanner;

import FlightControl.Logic.AssetControl;
import FlightControl.UI.UserInterface;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        AssetControl assetControl = new AssetControl();
        UserInterface ui = new UserInterface(assetControl, scanner);

        ui.start();
    }
}
