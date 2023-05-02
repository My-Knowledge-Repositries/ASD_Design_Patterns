public class ComputerBuilder {
    private String brand;
    private int ram;
    private int displaySize;
    private long diskSpace;

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setDiskSpace ( long diskSpace){
        this.diskSpace = diskSpace;
        return this;
    }

    public ComputerBuilder setDisplaySize ( int displaySize){
        this.displaySize = displaySize;
        return this;
    }

    public Computer getComputer(){
        return new Computer(brand, ram, displaySize, diskSpace);
    }
}