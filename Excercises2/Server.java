import java.util.Scanner;

class Solution {

    int numberOfCompletedTasks() {
        int tasks, total_time;

        Scanner sc = new Scanner(System.in);
        tasks = sc.nextInt();
        total_time = sc.nextInt();
        int ans = 0;
        while (tasks > 0) {

            int task = sc.nextInt();
            if (total_time >= task) {

                ans++;
            }
            total_time -= task;
            tasks--;

        }
        sc.close();

        return ans;
    }

}

public class Server {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numberOfCompletedTasks());
    }
}
