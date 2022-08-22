public class MaximumNumberofWordsFoundinSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int current = 0;
        for(int i = 0; i < sentences.length; i++)
        {
            for (int j = 0; j < sentences[i].length();j++)
            {
                if (sentences[i].charAt(j) == ' ')
                    current ++;
            }
            current ++;
            if (max < current)
                max = current;
            current = 0;
        }
        return max;
    }
}
