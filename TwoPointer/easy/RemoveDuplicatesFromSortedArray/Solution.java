class Solution {
    public int removeDuplicates(int[] nums) {

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[pointer] != nums[i]) {
                nums[pointer + 1] = nums[i];
                pointer++;
            }
        }

        return pointer + 1;
    }
}