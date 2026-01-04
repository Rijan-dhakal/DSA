# Squares of a Sorted Array

**Difficulty:** Easy  
**Topics:** Array, Two Pointers

### Approach

This problem requires a two pointer approach. Initialize a `left` pointer to point at the first index (0) of the array and a `right` pointer to point at the last index of the array. Create a new array `sortedArray` to store the results. Run a loop in descending order from the last index to the first index (i.e., from `right` to 0). In each iteration, compare the absolute values of the elements at `left` and `right` pointers. If the absolute value of `nums[left]` is greater than the absolute value of `nums[right]`, square `nums[left]` and place it at index `i` of the `sortedArray`, then increment the `left` pointer. Otherwise, square `nums[right]` and place it at index `i` of the `sortedArray`, then decrement the `right` pointer. This approach works because the largest squared values will always be at either end of the array (since the array is sorted), so we fill the result array from right to left with the largest values.

### Time & Space

- **Time:** O(n)
- **Space:** O(n)


#### Problem Link
[LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array)
