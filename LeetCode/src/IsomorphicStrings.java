import java.util.Arrays;
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length() || s.length() > 50000)
            return false;
        int[] vectorS = new int[256];
        int[] vectorT = new int[256];
        Arrays.fill(vectorS, -1);
        Arrays.fill(vectorT, -1);
        for (int i = 0; i < s.length(); i++)
        {
            if (vectorS[s.charAt(i)] == -1 && vectorT[t.charAt(i)] == -1)
            {
                vectorS[s.charAt(i)] = t.charAt(i);
                vectorT[t.charAt(i)] = s.charAt(i);
            }
            else if (!(vectorS[s.charAt(i)] == t.charAt(i) && vectorT[t.charAt(i)] == s.charAt(i)))
                return false;
        }
        return true;
    }
}
