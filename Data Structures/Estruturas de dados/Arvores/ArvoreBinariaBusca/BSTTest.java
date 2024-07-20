package Arvores.ArvoreBinariaBusca;

public class BSTTest
{
    public static void main(String[] args) {
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Travessia em ordem:");
        tree.inOrder();

        System.out.println("\n\nBusca por 40:");
        if (tree.search(40)) {
            System.out.println("Valor encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }

        System.out.println("Busca por 90:");
        if (tree.search(90)) {
            System.out.println("Valor encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}
