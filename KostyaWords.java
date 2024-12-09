import java.util.Scanner;

public class KostyaWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            // Read n (number of words) and m (max length of the first strip)
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            // Read the words
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = scanner.nextLine().trim();
            }

            // Calculate the maximum number of words that fit
            int currentLength = 0;
            int maxWords = 0;

            for (int i = 0; i < n; i++) {
                int wordLength = words[i].length();
                if (wordLength > m) {
                    // If a single word's length exceeds the limit, skip it
                    break;
                }
                if (currentLength + wordLength <= m) {
                    currentLength += wordLength;
                    maxWords++;
                } else {
                    break;
                }
            }

            // Output the result for this test case
            System.out.println(maxWords);
        }

        scanner.close();
    }
}
