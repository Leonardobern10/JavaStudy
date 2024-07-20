public class ListaEncadeadaCircular {
    Node head;

    public ListaEncadeadaCircular() {
        this.head = null;
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void remove(String data) {
        if (head == null) { // Lista vazia
            System.out.println("Lista vazia!");
            return ;
        }

        // O valor procurado está em head
        if (head.data.equals(data)) {
            // Se head aponta para ele mesmo, ou seja,
            // temos que a lista só tem 1 elemento
            if (head.next == head) {
                // Esvazia head
                head = null;
            } else {
                // Cria uma variavel current que recebe head
                // O primeiro item de uma lista que contém mais
                // itens
                Node current = head;
                // Procura o ultimo elemento pois ele estará
                // ligado ao head
                while (current.next != head) {
                    current = current.next;
                }
                // Encontra o elemento que está ligado ao head
                // e passa sua ligação ao proximo do head
                current.next = head.next;
                // Passa ao proximo do head a posição de head
                head = head.next;
            }
            return ;
        }
        // Cria um nó na variavel current preenchendo com head
        Node current = head;
        // Equando o nó que possui o valor procurado não é encontrado.
        // E: enquanto o ultimo elemento não chega, pois o ultimo
        // elemento é aquele que aponta para o head.
        while ( current.next != head && !current.next.data.equals(data)) {
            // Vai avançando na lista
                current = current.next;
        }
        // O nó procurado é encontrado
        if (current.next.data.equals(data)) {
            current.next = current.next.next;
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public void printList() {
        if ( head == null ) {
            System.out.println("Lista vazia!");
            return ;
        }
        Node current = head;
        while (current.next != head){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data + " -> " + current.next.data);
    }
}
