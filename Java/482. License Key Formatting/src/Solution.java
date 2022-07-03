public class Solution {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;

        s = s.replace("-", "").toUpperCase();
        StringBuilder result = new StringBuilder(s);
        int i = result.length() - k;

        while (i > 0) {
            result.insert(i, '-');
            i = i - k;
        }
        System.out.println(result.toString());
    }
}
