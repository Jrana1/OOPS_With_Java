import java.util.Scanner;

class Solution {

    public void solve() {

        int cases;
        Scanner sc = new Scanner(System.in);
        cases = sc.nextInt();

        while (cases > 0) {

            int cities, pilots;
            cities = sc.nextInt();
            pilots = sc.nextInt();
            for (int i = 0; i < pilots; i++) {

                int a = sc.nextInt();
                int b = sc.nextInt();
            }
            System.out.println(cities - 1);
            cases--;
        }
    }
}

public class Flying_safely {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
    }
}