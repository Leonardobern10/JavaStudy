package Rascunho;

public class TestStrategy {
    public static void main(String[] args) {
        Context soma = new Context(new Addition());
        int result = soma.doCalculate(2, 3);
        System.out.println(result);
    }
}
