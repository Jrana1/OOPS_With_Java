import java.util.Scanner;

class Solution {

    public void solve() {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if (str.equals("OCT 31") || str.equals("DEC 25")) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}

public class IsItHallowee {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
    }

}