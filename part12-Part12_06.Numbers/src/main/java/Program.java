
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            Random numbers = new Random();
            System.out.println(numbers.nextInt(11));
        }
    }

}
