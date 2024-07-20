package Exemplo;

public class Context
{
    private Strategy strategy;

    public Context (Strategy strategy) {
        this.strategy = strategy;
    }

    public String falar () {
        return this.strategy.fala();
    }
}
