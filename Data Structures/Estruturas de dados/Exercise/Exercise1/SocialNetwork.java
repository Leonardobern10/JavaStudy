package Exercise.Exercise1;

import java.util.*;

public class SocialNetwork {
    private static final Map<String, List<String>> social = new HashMap<>();

    public void addMembers(String k, String v) {
        social.putIfAbsent(k, new ArrayList<>());
        social.putIfAbsent(v, new ArrayList<>());
        social.get(k).add(v);
    }

    public void displayNetwork(String start) {
        Queue<String> currentMembers = new LinkedList<>();
        Set<String> exploredMembers = new HashSet<>();

        currentMembers.add(start);
        exploredMembers.add(start);

        while (!currentMembers.isEmpty()) {
            String member = currentMembers.poll();
            System.out.println(member + " ");

            List<String> neighborsMember = social.get(member);

            if (neighborsMember == null) continue;

            for (String neighbor : neighborsMember) {
                if (!neighborsMember.contains(neighbor)) {
                    currentMembers.add(neighbor);
                    exploredMembers.add(neighbor);
                }
            }
        }
    }
}
