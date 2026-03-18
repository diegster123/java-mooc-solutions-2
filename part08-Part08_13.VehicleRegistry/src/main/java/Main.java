
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);
        
        ArrayList<LicensePlate> danishPlates = new ArrayList<>();
        danishPlates.add(li3);
        
        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        System.out.println("Danish: " + danishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");
        System.out.println(" ");
        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        System.out.println(" ");
        VehicleRegistry registry = new VehicleRegistry();
        System.out.println(registry.add(li1, "Arto")); // true
        System.out.println(registry.add(li3, "Jurgen"));// true
        System.out.println(registry.add(li1, "Someone")); // false
        System.out.println(registry.add(li1, "Diego")); // false
        System.out.println(" ");
        System.out.println(registry.get(new LicensePlate("FI", "ABC-123"))); // Arto
        System.out.println(registry.get(new LicensePlate("D", "B WQ-431"))); //Jurgen
        registry.printLicensePlates(); //FI ABC-123 & D B WQ-431
        registry.printOwners(); //Arto & Jurgen
        
        System.out.println(" ");
        System.out.println(registry.remove(new LicensePlate("FI", "ABC-123"))); // true
        System.out.println(registry.get(li1)); // null
        registry.printLicensePlates(); //D B WQ-431
        
        
    }
}
