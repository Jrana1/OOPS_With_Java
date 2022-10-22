import java.util.Scanner;

class Solution {

    public int solve() {

        Scanner sc = new Scanner(System.in);
        int h, v;
        h = sc.nextInt();
        v = sc.nextInt();
        sc.close();
        double rad = (v * Math.PI) / 180;
        return (int) Math.ceil(h / Math.sin(rad));
    }
}

public class Ladder {

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.solve());

    }
}