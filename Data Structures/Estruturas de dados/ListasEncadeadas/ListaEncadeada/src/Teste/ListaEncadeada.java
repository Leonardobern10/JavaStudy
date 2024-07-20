package Teste;

public class ListaEncadeada {
    Node head;

    public ListaEncadeada() {
        this.head = null;
    }

     public void insert (String data) {
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
     }

    public void remove(String data) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Elemento não encontrado na lista.");
            return;
        }
        previous.next = current.next;
    }

    public void insertAt(int index, String data) {
        if (index < 0) {
            System.out.println("Índice inválido.");
            return;
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Índice fora do limite da lista.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

     public void display () {
        if(head == null) {
            System.out.println("A lista está vazia!");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
     }
}
