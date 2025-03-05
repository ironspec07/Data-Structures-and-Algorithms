import java.util.*;

public class PairSort {
    public static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int a,int b){
            x = a;
            y = b;
        }
        public int compareTo(Pair o){
            return this.x-o.x;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Pair(a, b);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
        sc.close();
    }
}
