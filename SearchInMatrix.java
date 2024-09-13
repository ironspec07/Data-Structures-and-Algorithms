import java.util.*;
public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==x){
                    r=1;
                    break;
                }
            }
        }
        if (r==1) {
            System.out.println("will not take number");
        }
        else{
            System.out.println("will take number");
        }
        sc.close();
    }
}
