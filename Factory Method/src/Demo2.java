import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Demo2 {
    public static void main(String[] args) {
        Vehicle car = Factory.getInstance().getVehicle(VehicleType.CAR);
        Vehicle van =Factory.getInstance().getVehicle(VehicleType.VAN);
        Vehicle bus =Factory.getInstance().getVehicle(VehicleType.BUS);
    }
}
