
import java.util.Scanner;

class Solution {

    public boolean solve() {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {

            if (str.charAt(i) == 's' && str.charAt(i + 1) == 's') {
                return true;
            }
        }
        return false;
    }
}

public class Hissing_Microphone {

    public static void main(String[] args) {

        Solution s = new Solution();

        if (s.solve()) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }

    }

}