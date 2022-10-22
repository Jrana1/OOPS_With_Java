import java.util.Scanner;

class Solution {

    void solve() {

        double x1, x2, y1, y2, p;
        Scanner sc = new Scanner(System.in);
        int n = 3;
        while (true) {

            x1 = Double.valueOf(sc.next());
            if (x1 == 0) {
                break;
            }
            y1 = Double.valueOf(sc.next());
            x2 = Double.valueOf(sc.next());
            y2 = Double.valueOf(sc.next());
            p = Double.valueOf(sc.next());
            double r1 = Math.pow(Math.abs(x1 - x2), p);
            double r2 = Math.pow(Math.abs(y1 - y2), p);
            System.out.printf("%.10f\n", Math.pow(r1 + r2, 1 / p));
        }
        sc.close();
    }
}

public class Different_Distances {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
        // System.out.println(Math.pow(2, 0.5));
    }
}
