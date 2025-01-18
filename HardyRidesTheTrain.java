import java.util.*;
public class HardyRidesTheTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long row = n/4;
        long col;

        if (row%2==0) {
            col = (n%4);
        }
        else {
            col = (3-(n%4));
        }
        System.out.println(row + " " + col);
        sc.close();
    }
}
