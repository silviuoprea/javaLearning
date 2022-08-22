public class FinalValueofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int number = 0;
        for (int i = 0; i < operations.length; i++)
        {
            if (operations[i].equals("X--") || operations[i].equals("--X"))
                number--;
            else if (operations[i].equals("X++") || operations[i].equals("++X"))
                number++;
        }
        return number;
    }
}
