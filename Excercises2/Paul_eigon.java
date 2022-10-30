
import java.util.Scanner;

class Solution {

    String whoseTurnToServe() {
        Scanner sc = new Scanner(System.in);
        // N = taks completed by one person
        // P = paul's score
        // Q = Paul's opponent's score
        // P+Q=total_rounds played as there is no draws
        int N, P, Q;
        N = sc.nextInt();
        P = sc.nextInt();
        Q = sc.nextInt();
        sc.close();

        int i = 0;
        int total_rounds = P + Q;
        if (total_rounds % N == 0) {
            if ((total_rounds / N) % 2 == 0) {

                return "paul";
            } else {
                return "opponent";
            }
        } else {
            if ((total_rounds / N) % 2 == 1) {

                return "opponent";
            } else {
                return "paul";
            }
        }
        // while (true) {
        // total_rounds -= N;
        // if (total_rounds > 0 && total_rounds < N) {
        // break;
        // }
        // if (i % 2 == 1 && total_rounds == 0) {

        // return "paul";
        // }
        // if (i % 2 == 0 && total_rounds == 0) {

        // return "opponent";
        // }
        // i++;

        // }

        // if (i % 2 == 1) {

        // return "opponent";
        // }
        // if (i % 2 == 0) {

        // return "paul";
        // }
        // return " ";
    }

}

public class Paul_eigon {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.whoseTurnToServe());
    }
}
