import java.util.Scanner;

public class MonkeySeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long m = sc.nextLong(); 
            long a = sc.nextLong(); 
            long b = sc.nextLong(); 
            long c = sc.nextLong(); 

            long row1 = Math.min(a, m);
            long row2 = Math.min(b, m);
            long remainingRow1 = m - row1; 
            long remainingRow2 = m - row2; 

            long noPreferenceUsed = Math.min(c, remainingRow1 + remainingRow2);

            long totalSeated = row1 + row2 + noPreferenceUsed;

            System.out.println(totalSeated);
        }

        sc.close();
    }
}
