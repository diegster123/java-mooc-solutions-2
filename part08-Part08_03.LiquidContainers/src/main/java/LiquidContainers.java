
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialValueOne = 0;
        int initialValueTwo = 0;
        int boundary = 100;
        
        System.out.println("First: " + initialValueOne + "/" + boundary);
        System.out.println("Second: " + initialValueTwo + "/" + boundary);
        
        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount >= 0) {
                initialValueOne += amount;
                if (initialValueOne > boundary) {
                    initialValueOne = boundary;
                }
            }
            
            if (command.equals("move") && amount >= 0) {
                if (amount > initialValueOne) {
                    amount = initialValueOne;
                }
                initialValueOne -= amount;
                initialValueTwo += amount;
                if (initialValueTwo > boundary) {
                    initialValueTwo = boundary;
                }
            }
            
            if (command.equals("remove") && amount >= 0) {
                initialValueTwo -= amount;
                if (initialValueTwo < 0) {
                    initialValueTwo = 0;
                }
            } 
            
            System.out.println("");
            System.out.println("First: " + initialValueOne + "/" + boundary);
            System.out.println("Second: " + initialValueTwo + "/" + boundary);
        }
    }
}
