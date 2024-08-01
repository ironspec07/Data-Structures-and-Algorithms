import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = r*r*3.141592653;
        System.out.println(String.format("%.9f", area));
        sc.close();
    }
}
// to get exact number of digits after decimal use syntax below
//          String.format("%.Df", decimalValue);
// Where D is the number required number of Decimal places
