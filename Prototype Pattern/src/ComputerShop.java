import java.util.ArrayList;

public class ComputerShop {
    private String shop;
    private ArrayList<Computer> computers = new ArrayList<>();

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
}
