import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        doSomething(a,b);        
        sc.close();
    }
    
    public static void doSomething(int x, int y) {
        if (x<4) {
            System.out.println("Invalid Input");
        }
        else{
            int tested = (int)(x/4);
            if (tested>y) {
                tested=y;
            }
            System.out.println(tested);
            System.out.println(y-tested);
        }
    }
}