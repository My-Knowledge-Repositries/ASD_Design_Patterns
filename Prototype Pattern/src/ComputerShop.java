import java.util.ArrayList;

public class ComputerShop implements Cloneable{
    private String shop;
    private ArrayList<Computer> computers = new ArrayList<>();

    public void initializeComputers(){
        for (int i = 0; i < 100; i++) {
            Computer c= new Computer();
            c.setBrand("Computer "+(i+1));
            c.setModel(i);
            getComputers().add(c);
        }
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "shop='" + shop + '\'' +
                ", computers=" + computers +
                '}';
    }

    @Override
    protected ComputerShop clone() throws CloneNotSupportedException {
        ComputerShop c = new ComputerShop();
        for (Computer tempT:getComputers()
             ) {
            c.getComputers().add(tempT);
        }
        return c;
    }
}
