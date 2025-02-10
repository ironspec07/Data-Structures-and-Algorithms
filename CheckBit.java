import java.util.*;
public class CheckBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if ((n & (1<<i)) == 0) {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
        sc.close();
    }
}