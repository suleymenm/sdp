import java.util.*;
interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land using a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by water using a ship.");
    }
}

class Drone implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by air using a drone.");
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class LandTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class WaterTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Drone();
    }
}

public class Main {
    public static void main(String[] args) {
        TransportFactory factory;
        System.out.println("Choose a way of delivery, type 1 for water, 2 for land and 3 for air");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            factory = new WaterTransportFactory();
            Transport ship = factory.createTransport();
            ship.deliver();
        }
        if (number == 2) {
            factory = new LandTransportFactory();
            Transport truck = factory.createTransport();
            truck.deliver();
        }
        if (number == 3){
        factory = new AirTransportFactory();
        Transport drone = factory.createTransport();
        drone.deliver();
        }
    }
}
