import java.util.*;
public class Colors {
    public static int[] distinct(int limit , int[][] queries){
        int n = queries.length;
        HashMap<Integer,Integer> ballColor = new HashMap<>();
        HashMap<Integer,Integer> colorFreq = new HashMap<>();
        int[] ans = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            if (ballColor.containsKey(ball)) {
                int prevColor = ballColor.get(ball);
                if (prevColor == color) {
                    ans[i] = colorFreq.size();
                }
                if (colorFreq.get(prevColor)==1) {
                    colorFreq.remove(prevColor);
                }
                else{
                    colorFreq.put(prevColor, colorFreq.get(prevColor)-1);
                }
            }
            ballColor.put(ball, color);
            colorFreq.put(color, colorFreq.getOrDefault(color, 0)+1);
            ans[i] = colorFreq.size();
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int n = sc.nextInt();
        int[][] queries = new int[n][2];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < 2; j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        int[] result = distinct(limit,queries);
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}