public class Teste
{
    public static void main(String[] args)
    {
        ListaDuplamenteEncadeada list = new ListaDuplamenteEncadeada();

        list.insert("A");
        list.insert("B");

        list.insert("C");
        list.insert("D");
        list.remove("D");
        list.printList();
        list.printInvertList();
    }

}
