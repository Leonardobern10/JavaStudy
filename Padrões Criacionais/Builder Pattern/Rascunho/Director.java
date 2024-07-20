package Rascunho;

public class Director {
    public static Boneco construct (Builder builder) {
        builder.createHead();
        builder.createTronco();
        builder.createBracos();
        builder.createPernas();
        return builder.createBoneco();
    }
}
