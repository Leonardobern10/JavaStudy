public class Director {
    public static Car construct(Builder builder) {
        builder.buildHead();
        builder.buildBody();
        builder.buildWheel();
        return builder.buildPart();
    }
}
