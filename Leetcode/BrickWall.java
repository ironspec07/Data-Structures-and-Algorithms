import java.util.*;

public class BrickWall {
    public static int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        for (List<Integer> bigList : wall) {
            int len = 0;
            for (int i = 0; i < bigList.size()-1; i++) {
                len += bigList.get(i);
                hm.put(len, hm.getOrDefault(len, 0)+1);
                ans = Math.max(ans, hm.get(len));
            }
        }
        return wall.size()-ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<List<Integer>> wall = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\\s+");
            List<Integer> bricks = new ArrayList<>();
            
            for (String part : parts) {
                if (!part.isEmpty()) { 
                    bricks.add(Integer.parseInt(part));
                }
            }
            
            wall.add(bricks);
        }
        int ans = leastBricks(wall);
        System.out.println(ans);
        sc.close();
    }
}
