import java.util.*;
public class InputOutputDatatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        char c = sc.next().charAt(0);
        float d = sc.nextFloat();
        double e = sc.nextDouble();
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
        sc.close();
    }
}
