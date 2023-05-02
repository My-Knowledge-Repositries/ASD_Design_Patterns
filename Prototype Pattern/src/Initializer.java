import java.util.ArrayList;

public class Initializer {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComputerShop shop1 = new ComputerShop();
        shop1.setShop("Colombo");
        shop1.initializeComputers();

        System.out.println(shop1);

        System.out.println(shop1);

        ComputerShop shop2 = (ComputerShop) shop1.clone();
        shop2.setShop("Kandy");
        shop1.setComputers(new ArrayList<>());

        System.out.println(shop2);
    }

    /*
    * java clones
    * it divides 2 parts.
    * 1. Shallow copy // When we do a copy of some entity to create two or more than two entities such that changes in one entity
    * are reflected in the other entities as well, then we can say we have done a shallow copy. but we not using the prototype pattern.
    * 2. Deep copy. // if request copies, given the new instances.
    *
    */

}
