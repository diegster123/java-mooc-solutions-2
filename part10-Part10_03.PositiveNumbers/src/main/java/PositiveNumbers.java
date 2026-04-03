
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here 
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Only positive numbers will be printed. Press 0 to end program.");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            numbers.add(input);
        }

        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toList());

    }

}
