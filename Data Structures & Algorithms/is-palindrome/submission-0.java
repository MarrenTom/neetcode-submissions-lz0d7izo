class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {
            char x  = s.charAt(i);
            if (Character.isLetterOrDigit(x)) {
                cleaned = cleaned + Character.toLowerCase(x);
            }
        }

        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < (cleaned.length() / 2); i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
