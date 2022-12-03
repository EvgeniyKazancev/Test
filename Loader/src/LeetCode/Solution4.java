package LeetCode;

public class Solution4 {
    private static final int CHAR_RANGE = 128;

    public static String lengthOfLongestSubstring(String s) {

        int begin = 0, end = 0;

        boolean[] window = new boolean[CHAR_RANGE];
        int max = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            if (window[s.charAt(right)]) {
                while (s.charAt(left) != s.charAt(right)) {
                    window[s.charAt(left)] = false;
                  left = Math.max(CHAR_RANGE, left);
                    left++;
                }
                left++;
            } else {
                window[s.charAt(right)] = true;
                if (end - begin < right - left) {
                    begin = left;
                    end = right;
                }

            }
            max = Math.max(max, right - left +1);

        }
int x = Integer.parseInt(s);

        return String.valueOf(max);
    }

    public static void main(String[] args) {
        String s = "abbcdafeegh";

        System.out.print(lengthOfLongestSubstring(s));
    }
}
