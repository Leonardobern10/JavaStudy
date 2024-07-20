package Fila;

public class Fila
{
    Node head;
    Node tail;

    public Fila () {
        this.head = null;
        this.tail = null;
    }

    public void insert(String data) {
        Node newNode = new Node (data);
        if ( head == null ) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void print() {
        if ( head == null ) {
            System.out.println("Lista vazia!");
        } else {
            Node current = head;
            while ( current != null ) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("Null");
        }
    }

    public void remove() {
        if ( head == null ){
            System.out.println("A lista esta vazia!");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public String firstElement() {
        return head == null ? "Lista vazia!" : head.data;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public int size() {
        if ( head == null ) return 0;
        Node current = head;
        int size = 0;
        while ( current != null ) {
            size++;
            current = current.next;
        }
        return size;
    }
}
