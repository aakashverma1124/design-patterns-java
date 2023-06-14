package creational.factory;

/**
 * Truck: It's a concrete class which is an implementations of the Transport interface.
 */
public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by Truck.");
    }
}
