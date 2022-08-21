public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftsum = nums[0];
        int[] leftsums = new int[nums.length];
        leftsums[0] = nums[0];
        if (nums.length < 2)
            return 0;
        if (nums.length < 3)
            if (nums[1] == 0)
                return 0;
            else
                return -1;
        leftsums[1] = nums[0] + nums[1];
        int overallsum = leftsums[1];
        if (nums.length == 3 && nums[0] == nums[2])
            return nums[1];
        for (int i = 2; i < nums.length; i++) {
            overallsum += nums[i];
            leftsums[i] += overallsum;
        }
        for (int i = 0; i < nums.length - 1; i++) {

            if ((overallsum - leftsums[0] == 0) || (overallsum - leftsums[leftsums.length - 2] == 0 && nums[nums.length - 1] != 0))
                return 0;
            if (leftsums[i] == overallsum - leftsums[i] - nums[i + 1])
                return i + 1;
        }
        if (overallsum - nums[nums.length - 1] == 0)
            return 0;
        return -1;
    }
}
