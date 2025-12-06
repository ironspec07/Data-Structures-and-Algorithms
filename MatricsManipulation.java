import java.util.*;
public class MatricsManipulation {
    public static void add(int[][] mat1,int[][] mat2){
        System.out.println("Matrix Addition:");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print((mat1[i][j]+mat2[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public static void sub(int[][] mat1,int[][] mat2){
        System.out.println("Matrix Addition:");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print((mat1[i][j]-mat2[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public static void mul(int[][] mat1,int[][] mat2,int n){
        int[][] ans = new int[n][n];
        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                for (int k = 0; k < ans.length; k++) {
                    ans[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {  
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat1 = new int[n][n];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        int[][] mat2 = new int[n][n];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        add(mat1,mat2);
        sub(mat1,mat2);
        mul(mat1,mat2,n);
        sc.close();
    }
}
