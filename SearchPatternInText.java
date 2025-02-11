import java.util.*;
public class SearchPatternInText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        String p = sc.nextLine();
        if (T.contains(p)) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }
}
