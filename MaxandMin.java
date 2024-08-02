import java.util.*;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int max;
        int min; 
        if (A>B) {
            if (A>C) {
                max = A;
            }
            else{
                max = C;
            }
        } else {
            if (B>C) {
                max = B;
            } else {
                max = C;
            }
        }
        if (A<B) {
            if (A<C) {
                min = A;
            } else {
                min = C;
            }
        } else {
            if (B<C) {
                min = B;
            } else {
                min = C;
            }
        }
        System.out.println(min+" "+max);
        sc.close();
    }
}
