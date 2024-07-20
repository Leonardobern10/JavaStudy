/*
* Fila -> Estrutura de dados do tipo FIFO.
* Operações:
*  1 - Adicionar items ao final da lista;
*  2 - Remover itens do Inicio da Lista;
*  3 - Percorrer a lista mostrando os items;
*
* Prioridade: Para cada operação, verificar a prioridade
* 1 - Para remover os itens ao final é necessario verificar antes a prioridade
*
*
* */

public class Node
{
    String data;
    Node next;
    int priority;

    public Node ( String data) {
        this.data = data;
        this.next = null;
        this.priority = 0;
    }

    public Node ( String data, int priority) {
        this.data = data;
        this.next = null;
        this.priority = priority;
    }
}
