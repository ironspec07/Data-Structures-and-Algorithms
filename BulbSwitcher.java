//Leetcode - 319
import java.util.*;
public class BulbSwitcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i*i <= n) {
            count++;
            i++;
        }
        System.out.println(count);
        sc.close();
    }
}