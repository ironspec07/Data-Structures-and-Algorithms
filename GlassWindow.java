import java.util.*;

public class GlassWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            StringBuilder s = new StringBuilder();

            // Reverse the string and apply transformations
            for (int j = str.length() - 1; j >= 0; j--) {
                char ch = str.charAt(j);
                if (ch == 'p') {
                    s.append('q');
                } else if (ch == 'q') {
                    s.append('p');
                } else {
                    s.append('w');
                }
            }

            // Output the transformed string
            System.out.println(s.toString());
        }

        sc.close();
    }
}
