package TabelaHash;

import java.util.Map;
import java.util.HashMap;

public class Store
{
    public static void main(String[] args) {
        Map<String, Double> frutas = new HashMap<>();

        System.out.println("Alternativa 1");
        frutas.put("Apple", 1.21);
        frutas.put("Pineapple", 3.18);
        for (Map.Entry<String, Double> fruta : frutas.entrySet()) {
            System.out.println("Fruta: " + fruta.getKey() + ", Preço: R$" + fruta.getValue());
        }
        System.out.println("\nAlternativa 2");
        for (String chave : frutas.keySet()) {
            Double valor = frutas.get(chave);
            System.out.println("Fruta: " + chave + ", Preço: R$" + valor);
        }
    }
}
