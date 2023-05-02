import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Demo1 {
    public static void main(String[] args) {
        Vehicle car = new Factory().getCar();
        Vehicle van =new Factory().getVan();
        Vehicle bus = new Factory().getBus();
    }
}
