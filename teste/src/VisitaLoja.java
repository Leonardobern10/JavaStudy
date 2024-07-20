public class VisitaLoja extends Pesquisa {

    @Override
    public void entrar() {
        System.out.println("Entrando na loja...");
    }

    @Override
    public void procurar() {
        System.out.println("Procurando departamento...");
    }

    @Override
    public void acessar() {
        System.out.println("Acessando departamento...");
    }

    @Override
    public void consultar() {
        System.out.println("Verificando preços...");
    }
}
