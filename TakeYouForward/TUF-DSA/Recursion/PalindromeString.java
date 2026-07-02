public class PalindromeString {
    public static void main(String[] args) {
        String palindrome = "MADAM";
        boolean isPanindrome = isPalindrome(palindrome, 0);
        System.out.println(isPanindrome);
    }

    private static boolean isPalindrome(String palindrome, int i) {
        char[] ch = palindrome.toCharArray();
        int n = ch.length;
        if (i >= n / 2) {
            return true;
        }
        if (ch[i] != ch[n - 1 - i]) {
            return false;
        }
        return isPalindrome(palindrome, i + 1);
    }

}
