import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String[] emails = new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        HashSet<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            int indexOfAddressSign = email.indexOf("@");
            int indexOfPlusSign = email.indexOf("+");
            String emailFragment = email.substring(0, indexOfAddressSign);

            if (emailFragment.contains("+")) {
                emailFragment = emailFragment.substring(0, indexOfPlusSign);
            }
            String removedDots = emailFragment.replace(".", "");
            uniqueEmails.add(removedDots + email.substring(indexOfAddressSign));
        }
        System.out.println(uniqueEmails.size());
    }
}
