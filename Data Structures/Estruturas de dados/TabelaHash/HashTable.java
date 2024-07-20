package TabelaHash;

import java.util.HashMap;
import java.util.Map;

public class HashTable
{
    private static Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter (String name) {
        if (voted.containsKey(name)) {
            System.out.println("Sai daqui!");
        } else {
            voted.put(name, true);
            System.out.println("Deixe-o votar!");
        }
    }

    public static void main(String[] args){
        checkVoter("Leonardo");
        checkVoter("Andressa");
        checkVoter("Leonardo");
    }

}
