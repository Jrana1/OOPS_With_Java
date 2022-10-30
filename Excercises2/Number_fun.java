
import java.util.Scanner;

class Solution {

    public void funNum() {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while (cases > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((a + b) == c || (Math.abs(a - b) == c) || ((double) a / (double) b) == c
                    || ((double) b / (double) a) == c
                    || (a * b) == c) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
            cases--;
        }

        sc.close();
    }
}

public class Number_fun {

    public static void main(String[] args) {

        Solution s = new Solution();

        s.funNum();
    }

}