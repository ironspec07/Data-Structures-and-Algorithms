import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);
        System.out.println(result);
        sc.close();
    }
}