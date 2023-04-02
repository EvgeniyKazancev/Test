package LeetCode;

public class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int[] nums = {3, 6, 9, 10};
        int target = 7;
        int result = solution9.searchInsert(nums, target);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            } else {
                if (nums[i] > target) {
                    index = i;
                    break;
                } else
                    index = i + 1;
            }
        }
        return index;
    }
}
