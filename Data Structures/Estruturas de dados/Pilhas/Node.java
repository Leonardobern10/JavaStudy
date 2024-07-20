package Pilhas;

/**
 * Cria um nó com as propriedades necessárias para utilizá-lo
 * em listas encadeadas.
 * */
public class Node
{
    String data;
    Node next;

    /**
     * Cria um nó com um valor definido por parâmetro.
     * Seu valor "next" é definido como {null} por padrão.
     * */
    public Node (String data) {
        this.data = data;
        this.next = null;
    }
}
