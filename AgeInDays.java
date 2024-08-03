import java.util.*;
public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long y = 0;
        long m = 0;
        long d = 0;
        // long rd = 0;

        if (n>=365) {
            y = n/365;
            d = n%365;
            // rd = n%365;
        }
        else{
            d = n;
            // rd = n;
        }
        // if (rd>=30) {
        if (d>=30) {
            m = d/30;
            d = d%30;
            // m = rd/30;
            // d = rd%30;
        }
        // else{
        //     d = rd;
        // }
        System.out.println(y+" years");
        System.out.println(m+" months");
        System.out.println(d+" days");
        sc.close();
    }
}
