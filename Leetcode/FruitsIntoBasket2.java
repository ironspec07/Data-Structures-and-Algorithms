//3477
import java.util.*;
public class FruitsIntoBasket2 {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] visited = new boolean[fruits.length];
        Arrays.fill(visited,false);
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] >= fruits[i]) {
                    visited[i] = true;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        int ans = 0;
        for (boolean b : visited) {
            if (b == false) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fruits = new int[n];
        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }        
        for (int i = 0; i < n; i++) {
            baskets[i] = sc.nextInt();
        }
        int ans = numOfUnplacedFruits(fruits,baskets);
        System.out.println(ans);
        sc.close();
    }
}
