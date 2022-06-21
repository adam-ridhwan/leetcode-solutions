import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String s = "bbbbb";

        int j = 0;
        int k = 0;
        int max = 0;

        HashSet<Character> uniqueChar = new HashSet<>();

        while (k < s.length()) {
            System.out.println(uniqueChar);
            if (!uniqueChar.contains(s.charAt(k))) {
                uniqueChar.add(s.charAt(k));
                k++;
                max = Math.max(uniqueChar.size(), max);
            } else {
                uniqueChar.remove(s.charAt(j));
                j++;
            }
        }
        System.out.println(max);
    }
}
