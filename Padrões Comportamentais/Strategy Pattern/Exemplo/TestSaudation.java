package Exemplo;

public class TestSaudation {
    public static void main( String[] args ) {
        Context apresentacao = new Context(new Apresentacao());
        System.out.println(apresentacao.falar());
        Context despedida = new Context(new Despedida());
        System.out.println(despedida.falar());
    }
}
