import java.util.ArrayList;

public class OrdenacaoSelecao {

    public static ArrayList<Integer> ordenar(ArrayList<Integer> array) {
        ArrayList<Integer> novoArray = new ArrayList<>(array.size());
        while (!array.isEmpty()) {
            int menorIndice = buscaMenor(array);
            novoArray.add(array.remove(menorIndice));
        }
        return novoArray;
    }

    private static int buscaMenor(ArrayList<Integer> array) {
        int menor = array.get(0);
        int menorIndice = 0;
        for (int i = 1; i < array.size(); i++) { // Iniciar a partir de 1
            if (array.get(i) < menor) {
                menor = array.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }
}
