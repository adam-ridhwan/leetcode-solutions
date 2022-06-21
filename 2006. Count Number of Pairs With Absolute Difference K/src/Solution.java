public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;

        int pointer1 = 0;
        int pointer2 = 1;
        int curr = 2;
        int result = 0;

        while (pointer2 != nums.length){
            if (Math.abs(nums[pointer1] - nums[pointer2++]) == k) {
                result++;
            }

            if (pointer2 == nums.length && pointer1++ != nums.length-1) {
                pointer2 = curr++;
            }
        }
        System.out.println(result);
    }
}
