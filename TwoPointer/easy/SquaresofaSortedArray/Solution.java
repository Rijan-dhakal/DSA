class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sortedArray = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for (int i = right; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                sortedArray[i] = nums[left] * nums[left];
                left++;
            } else {
                sortedArray[i] = nums[right] * nums[right];
                right--;
            }
        }

        return sortedArray;
    }
}