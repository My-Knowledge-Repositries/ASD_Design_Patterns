public class ComputerShop {
    public static void main(String[] args) {
        // saman
        Computer samanC= new Computer(
                "Lenovo",
                16,
                19,
                500L
        );

        //kamal
        Computer kamalC = new Computer(
                "Mac",
                8,
                16,
                256L
        );
        System.out.println(samanC);
        System.out.println(kamalC);
    }
}
