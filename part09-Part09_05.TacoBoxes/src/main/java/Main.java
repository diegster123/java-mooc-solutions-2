
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox fatass = new TripleTacoBox();
        System.out.println(fatass.tacosRemaining());
        fatass.eat();
        fatass.eat();
        fatass.eat();
        fatass.eat();
        System.out.println(fatass.tacosRemaining());
        
        CustomTacoBox customBox = new CustomTacoBox(5);
        System.out.println(customBox.tacosRemaining());
        customBox.eat();
        customBox.eat();
        customBox.eat();
        customBox.eat();
        customBox.eat();
        customBox.eat();
        System.out.println(customBox.tacosRemaining());
    }
}
