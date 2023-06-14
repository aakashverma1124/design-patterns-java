package creational.factory;

/**
 * Ship: It's a concrete class which is an implementations of the Transport interface.
 */
public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by Ship.");
    }
}
