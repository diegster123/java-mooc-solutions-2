
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            int value = Integer.valueOf(input);
            int cubed = value * value * value;
            System.out.println(cubed);
        }
        
    }
}
