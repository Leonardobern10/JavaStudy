public class OnlineOrderProcessor extends OrderProcessor
{

    @Override
    protected void selectItem() {
        System.out.println("Item selected from online catalog.");
    }

    @Override
    protected void placeOrder() {
        System.out.println("Order placed online");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment made through online gateway.");
    }

    @Override
    protected void deliver() {
        System.out.println("Item delivered to shipping address.");
    }
}
