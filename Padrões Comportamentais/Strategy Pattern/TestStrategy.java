public class TestStrategy {
    public static void main( String[] args ) {
        Context ctxAddition = new Context(new Addition());
        double resultAddition = ctxAddition.doCalculate(4, 2);
        System.out.println("Addition: " + resultAddition);
        Context ctxSubtraction = new Context(new Subtraction());
        double resultSubtraction = ctxSubtraction.doCalculate(4, 2);
        System.out.println("Subtraction: " + resultSubtraction);
    }
}
