package Grafos.PesquisaEmLargura;

import java.util.*;

public class PesquisaEmLargura {

    // Representação do grafo usando um Map (lista de adjacência)
    private final Map< String, List<String> > graph = new HashMap<>();

    // Método para adicionar arestas ao grafo
    public void addEdge( String v, String w ) {
        graph.putIfAbsent( v, new ArrayList<>() );
        graph.putIfAbsent( w, new ArrayList<>() ); // Garante que w também tenha uma lista de adjacência
        graph.get(v).add(w);
    }

    // Método para realizar a busca em largura a partir de um vértice inicial
    public void bfs(String start) {
        Queue<String> queue = new LinkedList<>(); // Fila para manter os vértices a serem explorados
        Set<String> visited = new HashSet<>(); // Conjunto para manter os vértices visitados

        queue.add(start); // Adiciona o vértice inicial à fila
        visited.add(start); // Marca o vértice inicial como visitado

        while (!queue.isEmpty()) {
            String vertex = queue.poll(); // Remove o vértice da frente da fila
            System.out.print(vertex + " "); // Processa o vértice (neste caso, apenas imprime)

            List<String> neighbors = graph.get(vertex);
            if (neighbors == null) continue; // Verifica se há vizinhos antes de iterar

            // Itera sobre todos os vértices adjacentes
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) { // Se o vértice adjacente não foi visitado
                    queue.add(neighbor); // Adiciona à fila
                    visited.add(neighbor); // Marca como visitado
                }
            }
        }
    }

    // Método principal para testar a BFS
    public static void main(String[] args) {
        PesquisaEmLargura bfs = new PesquisaEmLargura();

        // Construção do grafo
        bfs.addEdge("A", "B");
        bfs.addEdge("A", "C");
        bfs.addEdge("B", "D");
        bfs.addEdge("B", "E");
        bfs.addEdge("C", "F");
        bfs.addEdge("E", "F");

        System.out.println("Busca em Largura (BFS) a partir do vértice A:");
        bfs.bfs("A"); // Executa a BFS a partir do vértice "A"
    }
}
