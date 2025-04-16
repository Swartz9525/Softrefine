import java.util.*;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Text1 : ");
        String text1 = sc.nextLine();
        int length1 = text1.length();
        System.out.print("Enter the Text2 : ");
        String text2 = sc.nextLine();
        int length2 = text2.length();

        int[][] dp = new int[length1 + 1][length2 + 1];

        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[length1][length2]);
    }
}
