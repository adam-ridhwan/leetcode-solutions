public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int consecutive = 0;
        int counter = 0;

        for (int num : nums) {
            if (num == 1) {
                counter++;
                consecutive = Math.max(consecutive, counter);
            } else {
                counter = 0;
            }
        }
        System.out.println(consecutive);
    }
}
