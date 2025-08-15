import java.util.*;
public class BFS {
    private static List<List<Integer>> construction(int n, int m, int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int v = edges[i][0];
            int u = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
    private static void bfs(int n ,int m, int[][] edges){
        List<List<Integer>> graph = construction(n,m,edges);
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        q.add(0);
        vis[0] = true;
        while (q.size() > 0) {
            int rem = q.remove();
            System.out.print(rem+" ");
            List<Integer> nbrs = graph.get(rem);
            for (int v : nbrs) {
                if (vis[v] == false) {
                    q.add(v);
                    vis[v] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] edges = new int[m][2];
        for (int i = 0; i < edges.length; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        bfs(n,m,edges);
        sc.close();
    }
    
}