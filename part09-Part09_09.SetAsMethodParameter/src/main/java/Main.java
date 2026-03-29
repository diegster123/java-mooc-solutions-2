import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> set = new HashSet<>();
        set.add("Diego");
        set.add("Diego");
        set.add("Macy");
        
        System.out.println(returnSize(set));

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set<String> set) {
        return set.size();
    }
}
