package amd;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int result = 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int index = 1; index < n; index++) {
            leftMax[index] = Math.max(leftMax[index - 1], height[index]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int index = n - 2; index >= 0; index--) {
            rightMax[index] = Math.max(rightMax[index + 1], height[index]);
        }

        for (int index = 1; index < n - 1; index++) {
            int smallOne = Math.min(leftMax[index], rightMax[index]);
            result += smallOne - height[index];
        }


        return result;

    }
}