
import java.util.Scanner;

class Solution {

    public void solve() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {

            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            if ((r + c) < e) {
                System.out.println("advertise");
            } else if ((r + c) > e) {
                System.out.println("do not advertise");
            } else {
                System.out.println("does not matter");
            }
            n--;
        }
        sc.close();
    }
}

public class Nasty_Hacks {

    public static void main(String[] args) {

        Solution s = new Solution();
        // s.solve();
        System.out.println(33 * 33);
    }

}