package PaymentPage;

public class NetBankingPayment implements PaymentGateway{
    @Override
    public void pay(double amount) {
        System.out.println("Paying the amount: " +amount + " through NetBanking");
    }
}
