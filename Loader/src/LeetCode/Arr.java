package LeetCode;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(new Arr().removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));

    }
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
//    public int removeElement(int[] nums, int val) {
//
//        if (nums.length == 0) {
//            return 0;
//        }
//        int count = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            if (nums[i] == val){
//                nums[i] = 100;
//                count++;
//            }
//        }
//        boolean isSorted = false;
//        int buf;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] > nums[i + 1]) {
//                    isSorted = false;
//                    buf = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = buf;
//                }
//
//            }
//        }
//        return nums.length - count;

//        int l = 0, r = nums.length - 1;
//
//        for (; l < r || l == r && nums.length % 2 == 1; l++) {
//            if (nums[l] == val) {
//                while (nums[r] == val) {
//                    r--;
//                }
//                int temp = nums[l];
//                nums[l] = nums[r];
//                nums[r] = temp;
//            }
//        }
//        return l;
    }


