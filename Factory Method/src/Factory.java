import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

/*Factory Method = Factory + Singleton*/

public class Factory {

    private static Factory factory;

    private Factory() {
    }

    public static Factory getInstance() {
        return factory == null ? factory = new Factory() : factory;
    }


    public Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car();
            case VAN:
                return new Van();
            case BUS:
                return new Bus();
            default:
                return null;
        }
    }
}
