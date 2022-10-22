
import java.util.Scanner;

class Solution {
    int get_year(String str) {
        int x = 0;
        for (int i = 0; i < 4; i++) {
            x = x * 10 + str.charAt(i) - '0';
        }
        return x;
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String x = sc.next();
        int i = 0;
        while (i < n) {

            String line = sc.nextLine();
            // System.out.println(line + " " + x);
            String[] arr = new String[4];
            arr = line.split(" ", 5);
            int y1 = 0, y2 = 0, crs = 0;

            y1 = get_year(arr[1]);

            y2 = get_year(arr[2]);
            crs = Integer.parseInt(arr[3]);
            if (i == 0) {
                arr[0] = x;
            }
            if (y1 >= 2010) {
                System.out.println(arr[0] + " " + "eligible");
            } else if (y2 >= 1991) {
                System.out.println(arr[0] + " " + "eligible");
            } else if (y1 < 2010 && y2 < 1991 && crs >= 40) {
                System.out.println(arr[0] + " " + "ineligible");
            } else {
                System.out.println(arr[0] + " " + "coach petitions");

            }
            i++;
        }

        sc.close();
    }
}

public class Eligibility {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solve();
        // System.out.println(Math.pow(2, 0.5));
    }
}
