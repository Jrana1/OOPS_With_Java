
import java.util.Scanner;

class Solution {

    public void solve() {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        int i = 1;
        while (n > 0) {
            System.out.println(i + " Abracadabra");
            n--;
            i++;
        }

    }
}

public class Stuck_In_A_Time_Loop {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();

    }
}