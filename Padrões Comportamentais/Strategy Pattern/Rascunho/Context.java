package Rascunho;

public class Context {
    private final Strategy strategy;

    public Context (Strategy strategy) {
        this.strategy = strategy;
    }

    public int doCalculate(int a, int b) {
        return this.strategy.calculate(a, b);
    }
}
