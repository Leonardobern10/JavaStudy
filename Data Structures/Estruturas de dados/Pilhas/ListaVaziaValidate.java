package Pilhas;

/**
 * Classe criada para cuidar das validações
 */
public class ListaVaziaValidate
{
    /**
    * Verifica se a lista esta vazia.
    * Se estiver, lança uma exceção.
    */
    public static void listaVaziaValidate (Node head) throws ListaVaziaException {
        if (head == null) throw new ListaVaziaException("Não é possivel executar a remoção! A lista está vazia!");
    }
}
