class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int firstPointer = 0;
        int secondPointer = numbers.length - 1;

        while(firstPointer < secondPointer){
            int sum = numbers[firstPointer] + numbers[secondPointer];
            if(sum > target){
                secondPointer--;
            } else if(sum < target){
                firstPointer++;
            } else{
                return new int[] {firstPointer + 1, secondPointer + 1};
            }
        }
        return new int[] {};
    }
}