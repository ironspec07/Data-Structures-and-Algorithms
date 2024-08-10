import java.util.*;
public class NextAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        int c1 = c+1;
        if (c == 'z') {
            c1 = c-25;
        }
        System.out.println((char)c1);
        sc.close();
    }
}
