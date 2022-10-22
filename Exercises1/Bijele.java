
import java.util.Scanner;

class Solution {

    public void solve() {

        Scanner sc = new Scanner(System.in);
        int[] chess = { 1, 1, 2, 2, 2, 8 };
        for (int i = 0; i < 6; i++) {

            int x = sc.nextInt();
            System.out.print(chess[i] - x + " ");
        }
        sc.close();
    }
}

public class Bijele {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();

    }
}
