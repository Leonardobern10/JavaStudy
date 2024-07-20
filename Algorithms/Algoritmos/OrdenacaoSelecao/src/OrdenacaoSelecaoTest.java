import java.util.ArrayList;

public class OrdenacaoSelecaoTest
{
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(45);
        lista.add(48);
        lista.add(75);
        lista.add(14);

        System.out.println(OrdenacaoSelecao.ordenar(lista));
    }
}
