import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest = sc.nextLine();
        String host = sc.nextLine();
        String door = sc.nextLine();

        String combined = guest+host;

        char[] combinedArray = combined.toCharArray();
        Arrays.sort(combinedArray);
        String com = new String(combinedArray);

        char[] doorArray = door.toCharArray();
        Arrays.sort(doorArray);
        String d = new String(doorArray);

        if (com.equals(d)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
