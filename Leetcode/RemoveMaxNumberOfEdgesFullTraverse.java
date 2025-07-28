import java.util.*;
public class RemoveMaxNumberOfEdgesFullTraverse {
    public static int find(int x, int[] parent){
        if (x == parent[x]) {
            return x;
        }
        int temp = find(parent[x],parent);
        parent[x] = temp;
        return temp;
    }
    public static boolean union(int x,int y,int[] parent,int[] rank){
        int px = find(x,parent);
        int py = find(y,parent);

        if (px == py) {
            return false;
        }
        if (rank[px] > rank[py]) {
            parent[py] = px;
        }
        else if (rank[px] < rank[py]) {
            parent[px] = py;
        }
        else{
            parent[px] = py;
            rank[py]++;
        }
        return true;
    }
    public static int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a,b)-> Integer.compare(b[0], a[0]));
        int[] parentA = new int[n+1];
        int[] rankA = new int[n+1];
        int[] parentB = new int[n+1];
        int[] rankB = new int[n+1];
        for (int i = 0; i <= n; i++) {
            parentA[i] = parentB[i] = i;
            rankA[i] = rankB[i] = 1;
        }
        int ans = 0;
        int countA = 1;
        int countB = 1;

        for (int i = 0; i < edges.length; i++) {
            int cat = edges[i][0];
            int x = edges[i][1];
            int y = edges[i][2];

            if (cat == 3) {
                boolean mergeA = union(x, y, parentA, rankA);
                boolean mergeB = union(x, y, parentB, rankB);
                if (mergeA == false && mergeB == false) {
                    ans++;
                }
                if (mergeA == true) {
                    countA++;
                }
                if (mergeB == true) {
                    countB++;
                }
            }
            else if (cat == 2) {
                boolean mergeB = union(x, y, parentB, rankB);
                if (mergeB == false) {
                    ans++;
                }
                else{
                    countB++;
                }
            }
            else{
                boolean mergeA = union(x, y, parentA, rankA);
                if (mergeA == false) {
                    ans++;
                }
                else{
                    countA++;
                }
            }
        }
        if (countA != n || countB != n) {
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] edges = new int[m][3];
        for (int i = 0; i < edges.length; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        int ans = maxNumEdgesToRemove(n,edges);
        System.out.println(ans);
        sc.close();
    }
}