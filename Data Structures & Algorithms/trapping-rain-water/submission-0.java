class Solution {
    public int trap(int[] height) {
                int water = 0;
        int bottom = 0;
        int top = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        while (bottom < top) {
            if (height[bottom] <= height[top]) {
                if (height[bottom] >= maxLeft) {
                    maxLeft = height[bottom];
                } else {
                    water += maxLeft - height[bottom];
                }
                bottom++;
            } else {
                if (height[top] >= maxRight) {
                    maxRight = height[top];
                } else {
                    water += maxRight - height[top];
                }
                top--;
            }
        }
        return water;
        
    }
}
