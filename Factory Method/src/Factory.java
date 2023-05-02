import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Factory {
    public Vehicle getCar() {
        return new Car();
    }

    public Vehicle getVan() {
        return new Van();
    }

    public Vehicle getBus() {
        return new Bus();
    }
}
