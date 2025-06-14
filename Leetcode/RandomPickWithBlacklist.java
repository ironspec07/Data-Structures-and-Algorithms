import java.util.*;
public class RandomPickWithBlacklist {
    HashMap<Integer,Integer> hm;
    Random r;
    int valid; 
    
    public RandomPickWithBlacklist(int n, int[] blacklist){
        hm = new HashMap<>();
        r = new Random();
        for (int i = 0; i < blacklist.length; i++) {
            hm.put(blacklist[i], -1);
        }
        for (int i = 0; i < blacklist.length; i++) {
            if (blacklist[i]<valid) {
                while (hm.containsKey(n-1)==true) {
                    n--;
                }
                hm.put(blacklist[i], n-1);
                n--;
            }
        }
    }
    public int pick(){
        int val = r.nextInt(valid);
        if (hm.containsKey(val)==true) {
            return hm.get(val);
        }
        else{
            return val;
        }
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] blacklist = new int[m];
        for (int i = 0; i < blacklist.length; i++) {
            blacklist[i] = sc.nextInt();
        }
        RandomPickWithBlacklist solution = new RandomPickWithBlacklist(n, blacklist);
        int ans = solution.pick();
        System.out.println(ans);
        sc.close();
    }
}