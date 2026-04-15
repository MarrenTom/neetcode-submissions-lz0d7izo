class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int solution = 1;
        int topSolution = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == (nums[i - 1])) {
                continue;
            } else if (nums[i] == (nums[i - 1] + 1)) {
                solution++;
            } else {
                solution = 1;
            }
            if (topSolution < solution) {
                topSolution = solution;
            }
        }
        return topSolution;
    }
}
