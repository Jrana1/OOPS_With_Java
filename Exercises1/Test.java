import java.util.HashSet;

class Solution {

    Boolean isHalvAlike(String str) {
        HashSet<Character> st = new HashSet<>();
        char[] voils = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (var ch : voils) {
            st.add(ch);
        }
        int n = str.length();
        int half = n / 2;
        int leftCount = 0, rightCount = 0;
        for (int i = 0; half < n; i++, half++) {

            if (st.contains(str.charAt(i))) {
                leftCount++;
            }
            if (st.contains(str.charAt(half))) {
                rightCount++;
            }
        }

        return leftCount == rightCount;
    }
}

public class Test {

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.isHalvAlike("book"));
    }
}