import java.util.Arrays;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] vector = new int[200];
        int longestPalindrom = 0, flag = 0;
        Arrays.fill(vector, 0);
        for (int i = 0; i < s.length(); i++)
        {
            vector[s.charAt(i)]++;
        }
        for (int j = 65; j < 123;j++)
        {
            if (vector[j] % 2 == 1)
            {
                vector[j]--;
                flag = 1;
            }
            longestPalindrom += vector[j];
        }
        if (flag == 1)
            longestPalindrom += 1;
        return longestPalindrom;
    }
}
