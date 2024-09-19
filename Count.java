import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int d = str.charAt(i)-'0';
            sum = sum + d;
        }
        System.out.println(sum);
        sc.close();
    }
}
