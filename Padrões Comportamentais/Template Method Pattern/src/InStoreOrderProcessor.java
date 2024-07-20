public class InStoreOrderProcessor extends OrderProcessor
{

    @Override
    protected void selectItem() {
        System.out.println("Item selected from store shelf.");
    }

    @Override
    protected void placeOrder() {
        System.out.println("Order placed at checkout counter.");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment made at cash register.");
    }

    @Override
    protected void deliver() {
        System.out.println("Item handed over to customer.");
    }
}
