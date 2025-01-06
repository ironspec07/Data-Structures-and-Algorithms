import java.util.Scanner;

public class WaysToReach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int E = scanner.nextInt();

        int ways = countWays(S, E);

        System.out.println(ways);

        scanner.close();
    }

    private static int countWays(int S, int E) {
        if (S == E) {
            return 1;
        }

        if (S > E) {
            return 0;
        }

        return countWays(S + 1, E) + countWays(S + 2, E) + countWays(S + 3, E);
    }
}
