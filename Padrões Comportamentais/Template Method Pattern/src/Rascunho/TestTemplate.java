package Rascunho;

public class TestTemplate {
    public static void main(String[] args) {
        ComprarCarro carro = new ComprarCarro();
        ComprarMoto moto = new ComprarMoto();

        carro.compra();
        System.out.println("\n\n");
        moto.compra();
    }
}
