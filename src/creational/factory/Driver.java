package creational.factory;

public class Driver {
    public static void main(String[] args) {
        Transport transport = Logistics.createTransport("ship");
        if(transport != null){
            transport.deliver();
        }
    }
}
