# Two Sum II

**Difficulty:** Medium  
**Topics:** Array, Two Pointers

### Approach

Initialize two pointers: a first pointer starting at the beginning (index 0) and a second pointer starting at the end (last index). Loop while the first pointer is less than the second pointer. Calculate the sum of the numbers at both pointer positions. If the sum is greater than the target, decrement the second pointer to get a smaller value in the sorted array. If the sum is less than the target, increment the first pointer to get a larger value. If the sum equals the target, return both pointers incremented by 1, as the problem requires 1 based indexing.

### Time & Space

- **Time:** O(n)
- **Space:** O(1)

#### Problem Link
[LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted)
