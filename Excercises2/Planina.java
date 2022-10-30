import java.util.Scanner;

class Solution {
    // using recursion
    int planina1(int n) {

        if (n == 1) {
            return 3;
        }
        return 2 * planina1(n - 1) - 1;
    }

    // using memoization
    int planina2(int n) {

        int[] dp = new int[100];
        dp[1] = 3;

        for (int i = 2; i <= n; i++) {

            dp[i] = 2 * dp[i - 1] - 1;
        }

        return dp[n] * dp[n];
    }

    // using dynamic programming
    int planina3(int n) {

        int my_memory = 3;

        for (int i = 2; i <= n; i++) {
            my_memory = 2 * my_memory - 1;
        }
        return my_memory * my_memory;
    }
}

public class Planina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Solution s = new Solution();

        System.out.println(s.planina2(n));
        System.out.println(s.planina3(n));
        int res = s.planina1(n);
        System.out.println(res * res);
    }

}
