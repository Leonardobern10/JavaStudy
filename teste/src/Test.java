public class Test
{
    public static void main(String[] args) {
        Pesquisa pesquisaEmLoja = new VisitaLoja();
        Pesquisa pesquisaEmSite = new VisitaOnline();

        System.out.println("Realizando pesquisa na loja...");
        pesquisaEmLoja.pesquisaPreco();

        System.out.print("\n\n\n");

        System.out.println("Realizando pesquisa no site...");
        pesquisaEmSite.pesquisaPreco();
    }
}
