import resource.Bus;
import resource.Car;
import resource.Van;

public class Demo1 {
    public static void main(String[] args) {
        Car car = new Factory().getCar();
        Van van =new Factory().getVan();
        Bus bus = new Factory().getBus();
    }
}
