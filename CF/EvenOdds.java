import java.util.*;
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long oddCount = (n+1)/2;
        if (k <= oddCount ) {
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-oddCount));
        }
        sc.close();
    }
}
