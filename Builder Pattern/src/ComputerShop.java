public class ComputerShop {
    public static void main(String[] args) {
        // saman
       /* Computer samanC= new Computer(
                "Lenovo",
                16,
                19,
                500L
        );*/

        Computer samanC = new ComputerBuilder().setBrand("Lenovo").setDiskSpace(256).getComputer();

        //kamal
       /* Computer kamalC = new Computer(
                "Mac",
                8,
                16,
                256L
        );*/
        Computer kamalC = new ComputerBuilder().setRam(32).getComputer();
        System.out.println(samanC);
        System.out.println(kamalC);
    }
}
