package Pilhas;

public class Pilha {
    public static void main(String[] args) throws ListaVaziaException {
        // Utilizaremos uma lista encadeada pois iremos lidar com operações de adição e remoção
        // principalmente e exclusivamente no primeiro elemento.
        ListaEncadeada lista = new ListaEncadeada();

        lista.remover();
        System.out.println(lista.estaVazia());
        lista.inserir("Leonardo");
        lista.primeiroElemento();
        lista.inserir("Almeida");
        lista.primeiroElemento();
        lista.inserir("Bernardo");
        lista.remover();
        lista.inserir("Cristiano");
        lista.primeiroElemento();
        lista.printList();
        lista.estaVazia();
        System.out.println(lista.estaVazia());

    }

}
