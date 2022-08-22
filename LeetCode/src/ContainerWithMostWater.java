public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int index1 = 0;
        int index2 = height.length - 1;
        int max = 0;
        while(index1 != index2)
        {
            if (height[index1] >= height[index2])
            {
                if (height[index2] * (index2-index1) > max)
                    max = height[index2] * (index2-index1);
                index2--;
            }
            else
            {
                if (height[index1] * (index2-index1) > max)
                    max = height[index1] * (index2-index1);
                index1++;
            }
        }
        return max;
    }
}
