public class PaymentClient {
    public static void main(String[] args) {
        ThirdPartyPaymentSystem thirdPartyPaymentSystem = new ThirdPartyPaymentSystem();
        PaymentProcessor paymentProcessor = new PaymentAdapter(thirdPartyPaymentSystem);

        paymentProcessor.processPayment(100.0);
    }
}
