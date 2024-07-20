package Fila;

public class FilaTest {
    public static void main(String[] args) {
        Fila lista = new Fila();

        lista.insert("A");
        lista.print();
        lista.insert("B");
        lista.print();
        lista.insert("C");
        lista.print();
        System.out.println(lista.size());
        System.out.println(lista.firstElement());
        lista.print();
        lista.remove();
        lista.print();
        System.out.println(lista.firstElement());
        lista.print();
        lista.remove();
        lista.print();

    }
}
