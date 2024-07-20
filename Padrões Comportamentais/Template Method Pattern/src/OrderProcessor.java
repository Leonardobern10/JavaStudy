public abstract class OrderProcessor
{
    public final void processorOrder() {
        selectItem();
        placeOrder();
        doPayment();
        deliver();
    }

    protected abstract void selectItem();
    protected abstract void placeOrder();
    protected abstract void doPayment();
    protected abstract void deliver();
}
