import java.util.*;
public class Swap {
    public static void swap(int a , int b){
        System.out.println(b+" "+a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        sc.close();
    }
}
