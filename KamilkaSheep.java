import java.util.Scanner;

public class KamilkaSheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] beauty = new int[n];
            for (int i = 0; i < n; i++) {
                beauty[i] = sc.nextInt();
            }
            
            // Find minimum and maximum beauty levels
            int min = beauty[0], max = beauty[0];
            for (int i = 1; i < n; i++) {
                if (beauty[i] < min) {
                    min = beauty[i];
                }
                if (beauty[i] > max) {
                    max = beauty[i];
                }
            }
            
            // Maximum possible pleasure is max - min
            System.out.println(max - min);
        }
        sc.close();
    }
}
