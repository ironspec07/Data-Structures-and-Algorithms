import java.util.*;
public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (c) {
            case '<':
                if (a<b==true) {
                    System.out.println("Right");
                }
                else{
                    System.out.println("Wrong");
                }
                break;
            case '>':
                if (a>b==true) {
                    System.out.println("Right");
                }
                else{
                    System.out.println("Wrong");
                }
                break;
            case '=':
                if ((a==b) == true) {
                    System.out.println("Right");
                }
                else{
                    System.out.println("Wrong");
                }
                break;
        }
        sc.close();
    }
}
