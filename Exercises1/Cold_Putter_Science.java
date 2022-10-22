import java.util.Scanner;

class Solution {
    public int solve() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 0) {
                ans++;
            }
        }
        sc.close();
        return ans;
    }
}

// before submitting this code in Kattis change the name of main class name by
// the given
// name by kattice x.java file
public class Cold_Putter_Science {

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.solve());

    }
}
