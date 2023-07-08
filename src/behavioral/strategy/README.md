## Strategy Design Pattern

Strategy design pattern is one of the behavioral design pattern. Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.

### Example:
Let's consider a simple Shopping Cart where we have two payment strategies - using Credit Card or using PayPal. First of all we will create the interface for our strategy pattern example, in our case to pay the amount passed as argument. `PaymentStrategy.java`

Now we will have to create concrete implementation of algorithms for payment using credit/debit card or through paypal. 
- `CreditCardStrategy.java`
- `PaypalStrategy.java`

Now our strategy pattern example algorithms are ready. We can implement Shopping Cart and payment method will require input as Payment strategy. 
- `Item.java`
- `Shopping Cart`

Let’s test our strategy pattern example setup with a simple program. `Driver.java`

