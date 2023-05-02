public class Initializer {
    public static void main(String[] args) {
        ComputerShop shop1 = new ComputerShop();
        shop1.setShop("Colombo");
        shop1.initializeComputers();

        ComputerShop shop2 = new ComputerShop();
        shop2.setShop("Kandy");
        shop2.initializeComputers();

        System.out.println(shop1);
        System.out.println(shop2);
    }
}
