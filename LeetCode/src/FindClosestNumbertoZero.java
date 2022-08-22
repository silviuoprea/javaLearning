public class FindClosestNumbertoZero {
    public int findClosestNumber(int[] nums) {
        int minimum = 100001;
        boolean sign = true;
        for (int i = 0; i < nums.length; i++)
        {
            if (Math.abs(nums[i]) < minimum)
                if(nums[i] > 0)
                {
                    minimum = nums[i];
                    sign = true;
                }
                else
                {
                    minimum = Math.abs(nums[i]);
                    sign = false;
                }
            if (Math.abs(nums[i]) ==minimum && nums[i] > 0)
                sign = true;
        }
        if (sign == false)
            return 0 - minimum;
        return minimum;
    }
}
