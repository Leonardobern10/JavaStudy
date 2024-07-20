package Rascunho;

public class TestBuilder {
    public static void main(String[] args) {
        Boneco boneco = Director.construct(new ConcreteBuilder());
        System.out.println(boneco.getHead());
        System.out.println(boneco.getTronco());
        System.out.println(boneco.getBracos());
        System.out.println(boneco.getPernas());
    }
}
