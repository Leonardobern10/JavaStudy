public class PaymentAdapter implements PaymentProcessor{
    private ThirdPartyPaymentSystem thirdPartyPaymentSystem;

    public PaymentAdapter(ThirdPartyPaymentSystem thirdPartyPaymentSystem) {
        this.thirdPartyPaymentSystem = thirdPartyPaymentSystem;
    }

    @Override
    public void processPayment (double amount) {
        thirdPartyPaymentSystem.makePayment(amount);
    }
}
