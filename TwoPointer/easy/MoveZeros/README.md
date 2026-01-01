# Move Zeros to End

**Difficulty:** Easy  
**Topics:** Array

### Approach

First, initialize a `pointer` variable to point to the first index of the array. Loop through the array elements and check if elements are zero or not. If the element pointed by the loop is non-zero, then swap the `pointer` variable pointed element and the loop pointed element using a temporary variable and increment the value of `pointer` variable by 1. This method works even if the first element of the array is non-zero because the loop starts from index 0 and it finds that the zero indexed element is non-zero, then it swaps with the `pointer` variable value which is the same. And the pointer will be incremented so it fits for all test cases.

### Time & Space

- **Time:** O(n)
- **Space:** O(1)

#### Problem Link
[LeetCode](https://leetcode.com/problems/move-zeroes/)
