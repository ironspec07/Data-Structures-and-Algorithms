import java.util.Scanner;

public class LadyBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            
            // Component 1: positions where:
            //   - a contributes at odd indices (1-indexed)
            //   - b contributes at even indices.
            // Its capacity is the number of b-positions, which equals number of even numbers in 1..n.
            int onesComp1 = 0;
            int capacityComp1 = n / 2;  // integer division: counts even numbers from 1 to n
            
            // Component 2: positions where:
            //   - b contributes at odd indices
            //   - a contributes at even indices.
            // Its capacity is the number of b-positions, which equals number of odd numbers in 1..n.
            int onesComp2 = 0;
            int capacityComp2 = (n + 1) / 2;  // counts odd numbers from 1 to n
            
            // Loop over positions 1-indexed
            for (int i = 1; i <= n; i++) {
                // For component 1:
                // If index i is odd, it comes from a.
                if (i % 2 == 1) {
                    if (a.charAt(i - 1) == '1') {
                        onesComp1++;
                    }
                } else { // even index: from b.
                    if (b.charAt(i - 1) == '1') {
                        onesComp1++;
                    }
                }
                
                // For component 2:
                // If index i is odd, it comes from b.
                if (i % 2 == 1) {
                    if (b.charAt(i - 1) == '1') {
                        onesComp2++;
                    }
                } else { // even index: from a.
                    if (a.charAt(i - 1) == '1') {
                        onesComp2++;
                    }
                }
            }
            
            // For the password to be crackable,
            // the number of ones in each component must not exceed the number of positions in b.
            if (onesComp1 <= capacityComp1 && onesComp2 <= capacityComp2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
