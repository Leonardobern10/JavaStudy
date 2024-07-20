public class Teste
{
    public static void main(String[] args) {
        ListaEncadeadaCircular list = new ListaEncadeadaCircular();

        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");

        list.remove("C");

        list.printList();
    }
}
