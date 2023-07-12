

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
           
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            String command = split[0];
            int amount = Integer.valueOf(split[1]);

            if (command.equals("add")) {
                if (amount > 0 && amount <= 100) {
                    first += amount;
                } 

                if (amount > 100) {
                    first = 100;
                }
                if (first > 100) {
                    first = 100;
                }
            }   

            if (command.equals("move")) {

                if (first > amount) {
                    second += amount;
                    first -= amount;
                } else {
                    amount = first;
                    second += amount;
                    first = 0;
                }

                if (second > 100) {
                    second = 100;
                }
            }

            if (command.equals("remove")) {

                if (amount < second) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }

            System.out.println("");

        }
    }

}
