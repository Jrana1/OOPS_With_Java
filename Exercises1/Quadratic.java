import java.lang.*;
import java.util.*;

public class Quadratic {

    public static void main(String[] args) throws Exception {

        System.out.println("Quadratic EQ:ax^2+bx+c=0: Enter the value of a,b and c");

        Scanner sc = new Scanner(System.in);
        double a, b, c;

        a = Double.valueOf(sc.next());
        b = Double.valueOf(sc.next());
        c = Double.valueOf(sc.next());
        sc.close();
        try {
            check(a, b, c);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    static void check(double a, double b, double c) throws Exception {

        double D = (b * b - 4 * a * c);
        if (D == 0 || D < 0) {
            throw new Exception("The equation can't be solved as D=negative/zero");
        }
        D = Math.sqrt(D);
        double root1 = (-b + D) / (2 * a);
        double root2 = (-b - D) / (2 * a);
        System.out.println("x1-> " + root1 + ",x2-> " + root2);
    }
}