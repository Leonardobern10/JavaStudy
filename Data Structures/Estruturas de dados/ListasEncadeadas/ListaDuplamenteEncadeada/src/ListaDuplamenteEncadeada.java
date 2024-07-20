public class ListaDuplamenteEncadeada {
    Node head;

    public ListaDuplamenteEncadeada() {
        head = null;
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void remove(String data) {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }
        /* Cria uma variavel para receber o um nó começando
        por head */
        Node current = head;

        // Encontrar o nó a ser removido
        // Procura entre os elementos até encontrar um elementos
        // que seja igual ao data passado por parametro ou
        // seja null. Caso seja Null, o item não se encontra na lista
        while (current != null && !current.data.equals(data)) {
            // Quando o data é encontrado na lista ele é armazenado
            // na variavel current. Se não for achado, current fica null
            current = current.next;
        }

        // Se o nó não for encontrado
        if (current == null) {
            System.out.println("Elemento não encontrado!");
            return;
        }

        // Se o nó a ser removido for o primeiro nó
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.previous = null;
            }
        } else {
            // Ajustar o ponteiro do nó anterior, se não for o primeiro nó
            if (current.previous != null) {
                current.previous.next = current.next;
            }
        }

        // Ajustar o ponteiro do nó seguinte, se não for o último nó
        if (current.next != null) {
            current.next.previous = current.previous;
        }

        // Limpar os ponteiros do nó removido
        current.previous = null;
        current.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("A lista está vazia!");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void printInvertList() {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }

        // Encontrar o último nó
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Imprimir a lista do fim para o início
        System.out.print("Null");
        while (current != null) {
            System.out.print(" <- " + current.data);
            current = current.previous;
        }
        System.out.println();
    }
}
