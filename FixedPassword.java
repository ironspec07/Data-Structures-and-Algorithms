import java.util.*;
public class FixedPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a==1999) {
                System.out.println("Correct");
                break;
            }
            else{
                System.out.println("Wrong");
            }
        }
        sc.close();
    }
}
