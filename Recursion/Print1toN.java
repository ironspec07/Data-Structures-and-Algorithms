package Recursion;
import java.util.*;
public class Print1toN {
    public static void print(int i,int n){
        if(i==n){
            System.out.println(n);
            return;
        }
        System.out.println(i+" ");
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        print(i,n);
        sc.close();
    }
}