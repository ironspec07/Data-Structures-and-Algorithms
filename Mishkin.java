import java.util.*;

public class Mishkin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        outer:
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            // if n == 1, no operation is possible (no adjacent pair)
            if(n == 1) {
                System.out.println(-1);
                continue;
            }
            // Use a StringBuilder for mutable string operations.
            StringBuilder sb = new StringBuilder(s);
            // Count initial letters
            int countL = 0, countI = 0, countT = 0;
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if(c == 'L') countL++;
                else if(c == 'I') countI++;
                else if(c == 'T') countT++;
            }
            // Our target: final balanced counts: X for each letter.
            // We choose X = n (so final length will be 3n, and number of operations = 2n).
            int target = n;
            int deficitL = target - countL;
            int deficitI = target - countI;
            int deficitT = target - countT;
            // List to record the 1-indexed positions of each insertion.
            ArrayList<Integer> ops = new ArrayList<>();
            // We are allowed at most 2n operations.
            int maxOps = 2 * n;
            // Simulation: while some deficit is positive, try to perform an operation.
            while(deficitL > 0 || deficitI > 0 || deficitT > 0) {
                boolean performed = false;
                // Scan the current string for a valid adjacent pair.
                // Note: use current length as it increases.
                for (int i = 0; i < sb.length() - 1; i++) {
                    char a = sb.charAt(i);
                    char b = sb.charAt(i+1);
                    if(a == b) continue; // only allowed when adjacent letters differ
                    // Determine the forced inserted letter.
                    char ins;
                    if((a == 'L' && b == 'I') || (a == 'I' && b == 'L')) {
                        ins = 'T';
                    } else if((a == 'L' && b == 'T') || (a == 'T' && b == 'L')) {
                        ins = 'I';
                    } else { // (a == 'I' && b == 'T') or (a == 'T' && b == 'I')
                        ins = 'L';
                    }
                    // If we still need this letter, perform the operation.
                    if((ins == 'L' && deficitL > 0) ||
                       (ins == 'I' && deficitI > 0) ||
                       (ins == 'T' && deficitT > 0)) {
                        // Insert ins between positions i and i+1.
                        sb.insert(i+1, ins);
                        ops.add(i+1); // record the insertion position (1-indexed)
                        // Update counts and deficits.
                        if(ins == 'L') { deficitL--; countL++; }
                        else if(ins == 'I') { deficitI--; countI++; }
                        else { deficitT--; countT++; }
                        performed = true;
                        break; // restart scanning from beginning
                    }
                }
                // If no operation was performed in a full scan, then it is impossible.
                if(!performed) {
                    System.out.println(-1);
                    continue outer;
                }
                // Check that we do not exceed the allowed number of operations.
                if(ops.size() > maxOps) {
                    // Should not happen given our target, but just in case.
                    System.out.println(-1);
                    continue outer;
                }
            }
            // We have obtained a balanced string.
            System.out.println(ops.size());
            for (int pos : ops) {
                System.out.println(pos);
            }
        }
        sc.close();
    }
}
