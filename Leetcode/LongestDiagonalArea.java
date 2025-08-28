import java.util.*;
public class LongestDiagonalArea {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double dia = 0;
        for(int i = 0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            double d = Math.sqrt(l*l + b*b);
            if(d > dia){
                dia = d;
                area = l*b;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int ans = areaOfMaxDiagonal(arr);
        System.out.println(ans);
        sc.close();
    }
}
