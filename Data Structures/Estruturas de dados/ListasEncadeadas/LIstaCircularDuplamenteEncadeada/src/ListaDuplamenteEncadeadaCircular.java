public class ListaDuplamenteEncadeadaCircular
{
    Node head;

    public ListaDuplamenteEncadeadaCircular () {
        this.head = null;
    }

    public void insert (String data) {
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void remove(String data) {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }

        Node current = head;
        boolean found = false;

        // Procurar o nó a ser removido
        do {
            if (current.data.equals(data)) {
                found = true;
                break;
            }
            current = current.next;
        } while (current != head);

        // Se o nó não for encontrado
        if (!found) {
            System.out.println("Elemento não encontrado!");
            return;
        }

        // Se houver apenas um nó na lista
        if (current.next == head && current.prev == head) {
            head = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            // Se o nó a ser removido é o head
            if (current == head) {
                head = current.next;
            }
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(volta ao início)");
    }

    // Imprimir a lista em ordem inversa
    public void printListReverse() {
        if (head == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        Node tail = head.prev;
        Node current = tail;
        do {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        } while (current != tail);
        System.out.println("(volta ao fim)");
    }
}
