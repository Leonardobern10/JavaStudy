package Deque;

public class DequeTest
{
    public static void main(String[] args) {
        Deque lista = new Deque ();

        lista.addFirst("A");
        lista.addFirst("B");
        lista.addFirst("C");
        lista.addLast("W");
        lista.printList();
    }
}
