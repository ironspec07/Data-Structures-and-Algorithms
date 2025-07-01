import java.util.*;
public class BinaryNumberGenerator {
    public static void binaryNumber(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String rem = q.remove();
            System.out.println(rem);
            q.add(rem+"0");
            q.add(rem+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryNumber(n);
        sc.close();
    }
}
