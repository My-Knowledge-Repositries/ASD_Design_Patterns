public class Computer {
    private String brand;
    private int ram;
    private int displaySize;
    private long diskSpace;

    public Computer(String brand, int ram, int displaySize, long diskSpace) {
        this.brand = brand;
        this.ram = ram;
        this.displaySize = displaySize;
        this.diskSpace = diskSpace;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", raml=" + ram +
                ", displaySize=" + displaySize +
                ", diskSpace=" + diskSpace +
                '}';
    }
}
