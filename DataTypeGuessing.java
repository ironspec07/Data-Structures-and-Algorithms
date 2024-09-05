import java.util.*;
public class DataTypeGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long pro = a*b;
        if (pro%c==0) {
            long z = pro/c;
            if (z>=-2147483648 && z<=2147483647) {
                System.out.println("int");
            }
            else{
                System.out.println("long long");
            }
        }
        else{
            System.out.println("double");
        }
        sc.close();
    }
}

