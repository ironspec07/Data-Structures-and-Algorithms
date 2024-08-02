import java.util.*;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char X = sc.nextLine().charAt(0);
        int a = (int)X;
            if (a>=65 && a<= 90) {
                a=a+32;
                System.out.println((char)a);
            }
            else if (a>=97 && a<=122) {
                a=a-32;
                System.out.println((char)a);
            }
            sc.close();
        }
        
    }

