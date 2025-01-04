import java.util.*;
public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=1){
            if (n%2==0) {
                n = n/2;
                count++;
            }
            else {
                n = 3*n+1;
                count++;
            }
        }
        System.out.println(count+1);
        sc.close();
    }
}
