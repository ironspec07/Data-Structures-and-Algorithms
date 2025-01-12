import java.util.*;

class Solution {
    public int minMaxWeight(int n, int[][] edges, int threshold) {
        int left = 1, right = Integer.MIN_VALUE, result = -1;

        for (int[] edge : edges) {
            right = Math.max(right, edge[2]);
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canFormGraphWithMaxWeight(n, edges, threshold, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private boolean canFormGraphWithMaxWeight(int n, int[][] edges, int threshold, int maxWeight) {
        UnionFind uf = new UnionFind(n);
        Map<Integer, PriorityQueue<Integer>> outgoingEdgeWeights = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            if (w <= maxWeight) {
                uf.union(u, v);

                outgoingEdgeWeights.computeIfAbsent(u, k -> new PriorityQueue<>(Collections.reverseOrder())).add(w);
                if (outgoingEdgeWeights.get(u).size() > threshold) {
                    outgoingEdgeWeights.get(u).poll();
                }
            }
        }

        // Check if all nodes are connected to node 0
        for (int i = 0; i < n; i++) {
            if (!uf.isConnected(0, i)) {
                return false;
            }
        }

        // Check outgoing edges constraint
        for (PriorityQueue<Integer> pq : outgoingEdgeWeights.values()) {
            if (pq.size() > threshold) {
                return false;
            }
        }

        return true;
    }

    // Union-Find (Disjoint Set Union) with path compression and union by rank
    static class UnionFind {
        private int[] parent, rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
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
                if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                } else {
                    parent[rootY] = rootX;
                    rank[rootX]++;
                }
            }
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 5;
        int[][] edges = {{0,1,1},{0,2,2},{0,3,1},{0,4,1},{1,2,1},{1,4,1}};
        int threshold = 1;

        System.out.println(solution.minMaxWeight(n, edges, threshold)); // Example output
    }
}
