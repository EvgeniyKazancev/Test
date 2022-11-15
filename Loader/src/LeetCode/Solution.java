package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int last = 1001, ans = 0;
        for (char ch : s.toCharArray()) {
            int x = map.get(ch);
            if (last < x)
                ans += (x - last * 2);
            else
                ans += x;
            last = x;
        }
        return ans;
    }
}
