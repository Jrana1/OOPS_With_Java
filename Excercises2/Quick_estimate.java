import java.util.Scanner;

class Solution {

    void solve() {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {

            String num = sc.next();

            System.out.println(num.length());

            cases--;
        }
        sc.close();
    }
}

public class Quick_estimate {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
    }
}
