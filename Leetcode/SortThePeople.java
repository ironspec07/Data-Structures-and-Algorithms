import java.util.*;
public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] sorted=new String[names.length];
        int index=0;
        for(int i=heights.length-1;i>=0;i--){
            sorted[index]=map.get(heights[i]);
            index++;
        }
        return sorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] height = new int[n];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        String[] ans = sortPeople(names,height);
        for (String str : ans) {
            System.out.print(str+" ");
        }
        sc.close();
    }
}