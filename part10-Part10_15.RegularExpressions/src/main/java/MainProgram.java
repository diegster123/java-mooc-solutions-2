

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker check = new Checker();
        String day = "tue";
        String vowels = "queue";
        String date = "17:23:05";
        
        
        System.out.println(check.isDayOfWeek(day));
        System.out.println(check.allVowels(vowels));
        System.out.println(check.timeOfDay(date));
    }
}
