public class SubstringsDivisibleByLastDigit {

    public static int countDivisibleSubstrings(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                continue;
            }
            int d = c - '0';
            int currentMod = 0;
            int power = 1;
            int count_i = 0;

            for (int j = i; j >= 0; j--) {
                int digit = s.charAt(j) - '0';
                currentMod = (digit * power + currentMod) % d;
                if (currentMod == 0) {
                    count_i++;
                }
                power = (power * 10) % d;

                if (power == 0) {
                    if (currentMod == 0) {
                        count_i += j; // Add remaining possible substrings
                    }
                    break;
                }
            }

            total += count_i;
        }

        return total;
    }

    public static void main(String[] args) {
        String s1 = "12936";
        System.out.println(countDivisibleSubstrings(s1)); // Expected: 11

        String s2 = "5701283";
        System.out.println(countDivisibleSubstrings(s2)); // Expected: 18

        String s3 = "1010101010";
        System.out.println(countDivisibleSubstrings(s3)); // Expected: 25

        String s4 = "580231689239";
        System.out.println(countDivisibleSubstrings(s4)); // Expected: 39
    }
}