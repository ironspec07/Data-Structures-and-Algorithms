import java.util.*;
public class LuckyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        int lucky = 0;

        for(int i =0;i<num;i++){
            int idx = i+1;

            int asc = (int)str.charAt(i);

            if((idx % 2 != 0) || (asc % 2 != 0)){
                lucky += (idx*asc);
            }
        }
        System.out.println(lucky);
        sc.close();
    }
}
