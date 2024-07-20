package Rascunho;

public class ComprarMoto extends Template{
    @Override
    protected void procurarVeiculo() {
        System.out.println("Procurando uma moto...");
    }

    @Override
    protected void observarVeiculo() {
        System.out.println("Subindo na moto...");
    }

    @Override
    protected void verificarRodas() {
        System.out.println("Verificando as duas rodas...");
    }
}
