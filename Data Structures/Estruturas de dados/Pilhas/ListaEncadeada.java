package Pilhas;

public class ListaEncadeada
{
    Node head;

    public ListaEncadeada () {
        this.head = null;
    }

    /**
    * Permite inserir um novo elemento no topo da pilha.
    */
    public void inserir (String data) {
        Node newNode = new Node (data);
        if ( head == null ) {
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * Permite remover um item do topo da pilha;
     * */
    public void remover () throws ListaVaziaException {
        Node current = head;
        try {
            ListaVaziaValidate.listaVaziaValidate(current);
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
        }
        } catch (Exception error) {
            throw new ListaVaziaException(error.getMessage());
        }
    }
    /**
     * Imprime todos os elementos que compõem a pilha.
     * */
    public void printList() throws ListaVaziaException {
        try {
            ListaVaziaValidate.listaVaziaValidate(head);
            Node current = head;
            while ( current.next != null ) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println(current.data + " -> Null");
        } catch (ListaVaziaException e) {
            throw new ListaVaziaException(e.getMessage());
        }
    }

    /**
     * Retorna o elemento do topo da pilha.
     * */
    public void primeiroElemento () throws ListaVaziaException {
        try {
            ListaVaziaValidate.listaVaziaValidate(head);
            System.out.println(head.data);
        } catch (Exception error) {
            throw new ListaVaziaException(error.getMessage());
        }
    }

    /**
     * Verifica se a pilha está vazia!
     * */
    public boolean estaVazia() {
        return head == null;
    }
}
