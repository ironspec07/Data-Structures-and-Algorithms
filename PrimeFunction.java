import java.util.*;
public class PrimeFunction {
    public static void prime(long n){
        int count = 0;
        for(int i = 1; i*i<= n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else{
                    count = count + 2;
                }
            }
        }
        if(count==2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = sc.nextLong();
            prime(n);
        }
        sc.close();
    }
}
