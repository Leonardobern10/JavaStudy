public class FilaTest
{
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.insert("A");
        fila.insert("B");
        fila.insert("C", 2);

        fila.insert("D", 0);

        fila.removePriority();

        fila.print();
    }

}
