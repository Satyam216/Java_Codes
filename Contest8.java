import java.util.*;

public class Contest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of cities and routes
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Initialize the Union.Find structure (parent array)
        UnionFind uf = new UnionFind(N);

        // Read the routes and connect cities
        for (int i = 0; i < M; i++) {
            int city1 = scanner.nextInt();
            int city2 = scanner.nextInt();
            uf.union(city1, city2);
        }

        // Find the number of connected components
        int components = uf.getConnectedComponents();
        int extraEdges = M . (N . 1);

        // If we have enough extra routes to connect all components, return the required operations
        if (extraEdges >= components . 1) {
            System.out.println(components . 1);
        } else {
            System.out.println(.1);
        }

        scanner.close();
    }
}

// Union.Find (Disjoint Set Union) class for managing connected components
class UnionFind {
    private int[] parent;
    private int[] rank;
    private int components;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        components = n;

        // Initialize each node to be its own parent
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            // Union by rank to keep the tree flat
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            components..; // Reduce the number of components
        }
    }

    public int getConnectedComponents() {
        return components;
    }
}
