package Teste;

public class TesteList
{
    public static void main(String[] args)
    {
        ListaEncadeada list = new ListaEncadeada();

        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");
        list.insert("E");
        list.insert("F");

        list.remove("E");

        list.display();

    }
}
