import java.util.*;;
public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1 ) {
            return stones[0];
        }
        if (stones.length == 2) {
            if (stones[0] == stones[1]) {
                return 0;
            }
            else{
                return Math.abs(stones[0] - stones[1]);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        while (pq.size() > 1) {
            int a = pq.remove();
            int b = pq.remove();
            if (a != b) {
                pq.add(Math.abs(a-b));
            }
        }
        if (pq.size() == 0) {
            return 0;
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int[] stones = new int[n];
        for (int i = 0; i < stones.length; i++) {
            stones[i] = sc.nextInt();
        }
        int ans = lastStoneWeight(stones);
        System.out.println(ans);
        sc.close();
    }
}
