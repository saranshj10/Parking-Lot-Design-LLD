package PaymentPage;

public class PaymentManager {
    public PaymentGateway paymentOption(double price, PaymentMethods paymentMethods) {
        switch (paymentMethods){
            case DEBITCARD: return new CreditCardPayment();
            case NETBANKING: return new NetBankingPayment();
            case CASH:
            default: return new CashPayment();
        }
    }
}
