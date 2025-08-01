import java.util.*;
public class WordCapitilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 1) {
            System.out.println(str.toUpperCase());
        }
        else{
            char fl = str.charAt(0);
                System.out.println(Character.toUpperCase(fl)+str.substring(1));
        }
        sc.close();
    }
}
