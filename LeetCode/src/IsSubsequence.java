public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int punct = 0;
        if (t.length() == 0 && s.length() != 0)
            return false;
        else if (t.length() == 0)
            return true;
        else if (s.length() == 0)
            return true;
        for (int i = 0; i < s.length(); i++)
            for(int j = punct; j < t.length(); j++)
            {
                if (j == t.length()-1 && i != s.length()-1)
                    return false;
                if (s.charAt(i) == t.charAt(j))
                {
                    punct = j+1;
                    break;
                }
                else if (s.charAt(i) != t.charAt(j) && j == t.length()-1)
                    return false;
                else if (s.charAt(i) != t.charAt(j) && j == t.length()-1 && i == s.length()-1)
                    return false;
            }
        return true;
    }
}
