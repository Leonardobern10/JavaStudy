public class TemplateMethodPatternTest
{
    public static void main(String[] args) {
        OrderProcessor onlineOrder = new OnlineOrderProcessor();
        onlineOrder.processorOrder();

        System.out.println();
        System.out.println();

        OrderProcessor inStoreOrder = new InStoreOrderProcessor();
        inStoreOrder.processorOrder();
    }
}

