public class Teste
{
    public static void main(String[] args) {
        ListaDuplamenteEncadeadaCircular lista = new ListaDuplamenteEncadeadaCircular();
        lista.insert("A");
        lista.insert("B");
        lista.insert("C");
        lista.insert("D");

        System.out.println("Lista circular:");
        lista.printList();

        lista.remove("C");
        System.out.println("Lista após remover 'C':");
        lista.printList();

        lista.remove("A");
        System.out.println("Lista após remover 'A':");
        lista.printList();

        lista.insert("E");
        System.out.println("Lista após inserir 'E':");
        lista.printList();

        lista.remove("B");
        System.out.println("Lista após remover 'B':");
        lista.printList();

        lista.remove("D");
        System.out.println("Lista após remover 'D':");
        lista.printList();

        lista.remove("E");
        System.out.println("Lista após remover 'E':");
        lista.printList();

        System.out.println("Lista em ordem inversa:");
        lista.printListReverse();
    }
}
