import java.util.*;
public class FloatOrInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int i = (int)n;
        double d = n-i;
        if (d==0.0) {
            System.out.println("int "+i);
        }
        else{
            System.out.println("float "+i+" "+String.format("%.3f", d));
        }
        sc.close();
    }
}
