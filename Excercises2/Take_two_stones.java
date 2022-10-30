
import java.util.Scanner;

class Solution {

    public void solve() {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if (N % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}

public class Take_two_stones {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
    }

}