public class Fila {
    Node head;

    public Fila() {
        this.head = null;
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(String data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void remove() {
        if (head == null) {
            System.out.println("A lista está vazia!");
            return;
        }
        head = head.next;
    }

    public void removePriority(){
        if (head == null) {
            System.out.println("A lista está vazia!");
            return ;
        }
        Node current = head;
        int value = 0;
        while (current != null) {
            if (current.priority > value) {
                value = current.priority;
            }
            current = current.next;
        }

        Node previous = null;
        current = head;

        if (head.priority == value) {
            head = head.next;
            return ;
        }

        while (current != null && current.priority != value) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("A lista está vazia!");
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data);
    }
}
