import java.util.*;
public class EvenOddPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = 0;
        int o = 0;
        int p = 0;
        int ne = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if (a%2==0) {
                e++;
            } else {
                o++;    
            }
            if (a>0) {
                p++;
            }
            if (a<0) {
                ne++;
            }
        }
        System.out.println("Even: "+e);
        System.out.println("Odd: "+o);
        System.out.println("Positive: "+p);
        System.out.println("Negative: "+ne);
        sc.close();
    }
}
