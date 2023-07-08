package behavioral.strategy;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", "Apple AirPods Pro 2", 26999);
        Item item2 = new Item("5678", "Apple iPhone 14 Pro Max", 149999);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "password"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("Aakash Verma", "1234567890123456", "123", "12/28"));
    }
}
