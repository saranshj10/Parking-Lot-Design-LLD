package PaymentPage;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Paying the amount: "+ amount + " throught credit card");
    }
}
