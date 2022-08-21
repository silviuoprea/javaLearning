public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] number = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            number[i] = sum;
        }
        return number;
    }
}
