import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
