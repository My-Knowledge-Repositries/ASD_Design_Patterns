import resource.Bus;
import resource.Car;
import resource.Van;

public class Factory {
    public Car getCar() {
        return new Car();
    }

    public Van getVan() {
        return new Van();
    }

    public Bus getBus() {
        return new Bus();
    }
}
