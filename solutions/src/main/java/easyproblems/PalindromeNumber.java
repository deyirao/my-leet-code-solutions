package easyproblems;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        char[] digits = String.valueOf(x).toCharArray();
        int n = digits.length;

        for (int i = 0; i < n / 2; i++) {
            if (digits[i] != digits[n - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
