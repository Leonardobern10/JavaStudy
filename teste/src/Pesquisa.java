public abstract class Pesquisa {
    public final void pesquisaPreco () {
        entrar();
        procurar();
        acessar();
        consultar();
    }
    protected abstract void entrar();
    protected abstract void procurar();
    protected abstract void acessar();
    protected abstract void consultar();
}
