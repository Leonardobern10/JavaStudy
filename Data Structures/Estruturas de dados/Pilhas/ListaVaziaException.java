package Pilhas;

public class ListaVaziaException extends Exception
{
    /**
     * Responsável pela exceção que indica uma lista vazia.
     * */
    public ListaVaziaException (String message) {
        super(message);
    }
}
