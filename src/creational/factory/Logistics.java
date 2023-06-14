package creational.factory;

/**
 * This is creator class declares the factory method that returns new Transport objects.
 * It’s important that the return type of this method matches the Transport interface.
 */
public class Logistics {
    public static Transport createTransport(String transportType) {
        if(transportType.equals("truck")) {
            return new Truck();
        } else if(transportType.equals("ship")) {
            return new Ship();
        }
        return null;
    }
}
