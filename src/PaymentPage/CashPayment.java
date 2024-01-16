package PaymentPage;

public class CashPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Paying the amount: " + amount + " throught cash only");
    }
}
