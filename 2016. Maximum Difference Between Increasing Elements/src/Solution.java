public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 10};

        int diff = -1;
        for (int i = 1, min = nums[0]; i < nums.length; ++i) {
            if (nums[i] > min) {
                diff = Math.max(diff, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }

        System.out.println(diff);


    }
}
