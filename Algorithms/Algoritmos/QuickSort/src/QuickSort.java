import java.util.ArrayList;

public class QuickSort {

    public static ArrayList<Integer> ordenar(ArrayList<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            ArrayList<Integer> menores = new ArrayList<>();
            ArrayList<Integer> maiores = new ArrayList<>();
            int pivo = array.getFirst();
            for (int i = 1; i < array.size(); i++) {  // Começar do índice 1
                if (array.get(i) < pivo) {
                    menores.add(array.get(i));
                } else {
                    maiores.add(array.get(i));
                }
            }

            ArrayList<Integer> sorted = new ArrayList<>();
            sorted.addAll(ordenar(menores));  // Recursão para ordenar menores
            sorted.add(pivo);  // Adiciona o pivô
            sorted.addAll(ordenar(maiores));  // Recursão para ordenar maiores

            return sorted;
        }
    }
}
