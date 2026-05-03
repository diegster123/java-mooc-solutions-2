
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> strings = new List<>();
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }
        
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println(strings.contains(input));
        }
    }

}
