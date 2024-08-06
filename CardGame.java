import java.util.*;
public class CardGame {
    int score(int a,int b,int c,int d){
        int f = 0;
        int s = 0;
        if(a>b){
            f++;
        }
        else if(a==b){}
        else{
            s++;
        }
        if (c>d) {
            s++;
        }
        else if (c==d) {}
        else{
            s++;
        }
        return f>s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int ans = 0;
            ans = ans + score
            

            System.out.println(g);
        }
        sc.close();
    }
}
