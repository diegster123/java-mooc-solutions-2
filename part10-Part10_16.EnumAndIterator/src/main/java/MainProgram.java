
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();
        university.fire(Education.HS);

        System.out.println("==");
        university.print();
        
        System.out.println("==");   
        Person h = new Person("Arto", Education.PHD);
        
        university.add(h);
        university.fire(Education.PHD);
        university.print();
    }
}
