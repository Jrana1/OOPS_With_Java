
import java.util.Scanner;

class Solution {

    public int solve() {

        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        return 4;

    }
}

public class Quadrant_Selection {

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solve());

    }
}