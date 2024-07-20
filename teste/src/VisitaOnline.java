public class VisitaOnline extends Pesquisa {

    @Override
    public void entrar() {
        System.out.println("Entrando no site...");
    }

    @Override
    public void procurar() {
        System.out.println("Procurando a sessão...");
    }

    @Override
    public void acessar() {
        System.out.println("Acessando a sessão...");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando preço...");
    }
}
