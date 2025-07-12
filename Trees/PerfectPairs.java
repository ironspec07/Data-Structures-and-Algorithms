import java.util.*;
import java.io.*;

public class PerfectPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        
        int[] sandwiches = new int[N];
        line = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sandwiches[i] = Integer.parseInt(line[i]);
        }
        
        Map<Map<Integer, Integer>, Integer> freqMap = new HashMap<>();
        long result = 0;
        
        for (int num : sandwiches) {
            Map<Integer, Integer> factors = new HashMap<>();
            int temp = num;
            
            // Prime factorization of num
            for (int i = 2; i * i <= temp; i++) {
                while (temp % i == 0) {
                    factors.put(i, factors.getOrDefault(i, 0) + 1);
                    temp /= i;
                }
            }
            if (temp > 1) {
                factors.put(temp, factors.getOrDefault(temp, 0) + 1);
            }
            
            // Compute current and complement factor maps
            Map<Integer, Integer> current = new HashMap<>();
            Map<Integer, Integer> complement = new HashMap<>();
            
            for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
                int prime = entry.getKey();
                int exponent = entry.getValue();
                int mod = exponent % K;
                if (mod != 0) {
                    current.put(prime, mod);
                    complement.put(prime, K - mod);
                }
            }
            
            // The complement map is what we need to find in freqMap
            result += freqMap.getOrDefault(complement, 0);
            
            // Update freqMap with current map
            freqMap.put(current, freqMap.getOrDefault(current, 0) + 1);
        }
        
        System.out.println(result);
    }
}