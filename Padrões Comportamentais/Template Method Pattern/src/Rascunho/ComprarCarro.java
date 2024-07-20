package Rascunho;

public class ComprarCarro extends Template {
    @Override
    protected void procurarVeiculo () {
        System.out.println("Procurando um carro...");
    }

    @Override
    protected void observarVeiculo () {
        System.out.println("Entrando no carro...");
    }

    @Override
    protected void verificarRodas () {
        System.out.println("Verificando as quatro rodas...");
    }
}
