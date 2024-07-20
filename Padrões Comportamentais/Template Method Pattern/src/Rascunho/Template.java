package Rascunho;

public abstract class Template {
    public void compra () {
        chegarAteLocal();
        entrarConcessionaria();
        procurarVeiculo();
        observarVeiculo();
        verificarRodas();
        perguntarValor();
    };
    protected void chegarAteLocal() {
        System.out.println("Chegando à concessionária...");
    };
    protected void entrarConcessionaria() {
        System.out.println("Entrando na concessionária...");
    };
    protected abstract void procurarVeiculo();
    protected abstract void observarVeiculo();
    protected abstract void verificarRodas();

    protected void perguntarValor() {
        System.out.println("Quanto custa?");
    };
}
