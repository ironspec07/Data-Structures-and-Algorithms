import java.util.Scanner;

public class LexicographicalMaximization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline

        while (t-- > 0) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();

            // Process the string from right to left
            for (int i = chars.length - 1; i > 0; i--) {
                // While the current digit is greater than the previous one and not 0
                while (i > 0 && chars[i] > chars[i - 1] && chars[i] != '0') {
                    // Swap current digit with the previous one and decrement the current digit
                    char temp = chars[i];
                    chars[i] = chars[i - 1];
                    chars[i - 1] = (char) (temp - 1); // Decrease the digit by 1
                    i--; // After swapping, check the previous digits again
                }
            }

            // Print the final lexicographically maximum string
            System.out.println(new String(chars));
        }

        scanner.close();
    }
}
