class Solution {
    public int maxArea(int[] heights) {
        int bottom = 0;
        int top = heights.length - 1;
        int maxVolume = 0;
        while (bottom < top) {
            int h;
            if (heights[bottom] <= heights[top]) {
                h = heights[bottom];
            } else {
                h = heights[top];
            }
            int tempVolume = h * (top - bottom);
            if (tempVolume > maxVolume) {
                maxVolume = tempVolume;
            }
            if (heights[bottom] < heights[top]) 
                bottom++;
            else {
                top--;
            }
        }
        return maxVolume;
        
    }
}
