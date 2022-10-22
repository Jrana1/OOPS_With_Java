
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    void checkAndPrint(List<Integer> num) {

        if (num.size() == 0) {
            System.out.println("YODA");
        } else {
            int n = num.size();
            int x = 0;
            for (int i = n - 1; i >= 0; i--) {
                x = x * 10 + num.get(i);
            }
            System.out.println(x);
        }
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        List<Integer> newNum1 = new ArrayList<>();
        List<Integer> newNum2 = new ArrayList<>();
        while (n1 > 0 || n2 > 0) {

            int d1, d2;
            if (n1 == 0) {
                d1 = 0;
            }
            if (n2 == 0) {
                d2 = 0;
            }
            d1 = n1 % 10;
            d2 = n2 % 10;
            if (d1 == d2) {
                newNum1.add(d1);
                newNum2.add(d2);
            } else if (d1 > d2) {
                newNum1.add(d1);
            } else {
                newNum2.add(d2);
            }
            n1 /= 10;
            n2 /= 10;
        }
        // System.out.println(newNum1 + " " + newNum2);
        sc.close();
        checkAndPrint(newNum1);
        checkAndPrint(newNum2);
    }
}

public class Yoda {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
        // System.out.println(Math.pow(2, 0.5));
    }
}
