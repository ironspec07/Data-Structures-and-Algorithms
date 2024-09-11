import java.util.*;
public class FindingMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <=k; j++) {
                int n = sc.nextInt();count++;
                if (n<min) {
                    min=n;
                }
                if (count==N) {
                    System.out.print(min+" ");
                    break;
                }
            }
            if (count==N) {
                break;
            }
            else{
                System.out.print(min+" ");
            }
        }
        
        sc.close();
    }
}
