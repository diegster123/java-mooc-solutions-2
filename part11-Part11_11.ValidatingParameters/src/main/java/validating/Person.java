package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {       
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name should not be empty.");
        } else if (name.length() > 40) {
            throw new IllegalArgumentException("Name should be less than 40 characters long.");
        } 
        
        if (age > 120 || age < 0) {
            throw new IllegalArgumentException("Age should only be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
