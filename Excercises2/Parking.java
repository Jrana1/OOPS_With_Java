import java.util.ArrayList;
import java.util.Scanner;

class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

}

class Solution {

    int totalParkingCost() {

        // A=cost per truck when only one truck is parked
        // B=cost per truck when 2 trucks are parked
        // C=cost per truck when 3 trucks are parked

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = 3;
        ArrayList<Interval> intervals = new ArrayList<>();
        while (N > 0) {

            int st = sc.nextInt();
            int en = sc.nextInt();
            intervals.add(new Interval(st, en));
            N--;
        }
        sc.close();
        int i = intervals.get(0).getStart() + 1;
        int j = intervals.get(1).getStart() + 1;
        int k = intervals.get(2).getStart() + 1;
        int m = intervals.get(0).getEnd();
        int n = intervals.get(1).getEnd();
        int o = intervals.get(2).getEnd();
        int mx_interval = Math.max(Math.max(m, n), o);
        int mn_interval = Math.min(Math.min(i, j), k);
        int total_cost = 0;
        for (int x = mn_interval; x <= mx_interval; x++) {

            if ((x >= i && x <= m) && (x >= j && x <= n) && (x >= k && x <= o)) {

                total_cost += C * 3;
                continue;
            }
            if (((x >= i && x <= m) && (x >= j && x <= n)) || ((x >= k && x <= o) && (x >= j && x <= n))
                    || ((x >= i && x <= m) && (x >= k && x <= o))) {
                total_cost += B * 2;
                continue;
            } else {
                total_cost += A;
            }

        }
        System.out.println(total_cost);
        return 0;

    }

}

public class Parking {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.totalParkingCost();

    }
}
