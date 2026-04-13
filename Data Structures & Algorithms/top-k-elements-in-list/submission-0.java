class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] values = new int[nums.length];
        int[] counts = new int[nums.length];


        int count = 1;
        int size = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1]) {
                count++;
            } else {
                values[size] = nums[i - 1];
                counts[size] = count;
                size++;
                count = 1;
            }
        }
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int maxIndex = 0;
            for (int j = 1; j < size; j++) {
                if (counts[j] > counts[maxIndex]) {
                    maxIndex = j;
                }
            }
        result[i] = values[maxIndex];
        counts[maxIndex] = -1;
        }

        return result;
    }
}
