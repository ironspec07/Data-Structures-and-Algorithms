import java.util.*;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fd = x/1000;
        if (fd%2==0) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        sc.close();
    }
}
