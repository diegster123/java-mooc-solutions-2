
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
        
        System.out.println("");
        System.out.println("Declare a new int array and how many numbers you want to put into it...");
        System.out.println("Input length below...");
        int[] array;
        while (true) {
            int length = Integer.valueOf(scan.nextLine());
            array = new int[length];
            System.out.println("Now declare its values...");
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.valueOf(scan.nextLine());
            }
            break;
        }
        
        System.out.println("Input from which position you would like to start to calculate the sum..");
        int fromWhere = Integer.valueOf(scan.nextLine());
        System.out.println("Input to which position you would like to end with to calculate the sum..");
        int toWhere = Integer.valueOf(scan.nextLine());
        System.out.println("Input smallest acceptable number");
        int smallest = Integer.valueOf(scan.nextLine());
        System.out.println("Input largest acceptable number");
        int largest = Integer.valueOf(scan.nextLine());
        System.out.println("Sum:");
        System.out.println(sum(array, fromWhere, toWhere, smallest, largest));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0 || toWhere > array.length) {
            fromWhere = 0;
            toWhere = array.length;
        }
        int sum = 0;
        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] <= largest && array[i] >= smallest) {
                sum += array[i];
            }
        }

        return sum;
    }

}
