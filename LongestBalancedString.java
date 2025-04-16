
import java.util.Scanner;

public class LongestBalancedString {

    public static int longestBalancedSubstring(String s) {
        int maxLen = 0;
        int n = s.length();

        // Try all even-length substrings
        for (int i = 0; i < n; i++) {
            for (int len = 2; i + len <= n; len += 2) {
                String sub = s.substring(i, i + len);
                if (isValid(sub)) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }

    // Check if a string can be converted into a valid balanced bracket string
    private static boolean isValid(String s) {
        return checkValidWithBacktracking(s.toCharArray(), 0, 0);
    }

    // Backtracking helper to try all valid replacements of '?'
    private static boolean checkValidWithBacktracking(char[] arr, int index, int balance) {
        if (balance < 0) {
            return false;
        }
        if (index == arr.length) {
            return balance == 0;
        }

        if (arr[index] == '<') {
            return checkValidWithBacktracking(arr, index + 1, balance + 1);
        } else if (arr[index] == '>') {
            return checkValidWithBacktracking(arr, index + 1, balance - 1);
        } else if (arr[index] == '?') {
            // Try replacing '?' with '<' or '>'
            return checkValidWithBacktracking(arr, index + 1, balance + 1)
                    || checkValidWithBacktracking(arr, index + 1, balance - 1);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string consisting of '<', '>', and '?': ");
        String input = scanner.nextLine();
        scanner.close();

        int result = longestBalancedSubstring(input);
        System.out.println("Length of the longest balanced substring: " + result);
    }
}
