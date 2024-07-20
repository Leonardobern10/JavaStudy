package Deque;

public class Deque {
    Node head;
    Node tail;

    public Deque() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        } else {
            newNode.next = head;

        }
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Deque está vazio!");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Deque está vazio!");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }

    public String getFirst() {
        if (head == null) {
            return "Deque está vazio!";
        } else {
            return head.data;
        }
    }

    public String getLast() {
        if (tail == null) {
            return "Deque está vazio!";
        } else {
            return tail.data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Lista vazia!");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("Null");
        }
    }

}
