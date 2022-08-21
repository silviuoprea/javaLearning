public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int sum = 0;
        int[] arr = new int[digits.length+1];
        if(digits.length == 1 && digits[0] == 9)
            sum++;
        while (digits[i] == 9 && i > 0)
        {
            sum++;
            i--;
            if(i == 0 && digits[i] == 9)
                sum++;
        }
        for(int j = digits.length - 1 - sum; j < digits.length; j++)
        {
            if (j == -1)
            {
                arr[0] = 1;
                return arr;
            }
            if (digits[j] != 9)
                digits[j]++;
            else
                digits[j] = 0;
        }
        return digits;
    }
}
