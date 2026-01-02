# Remove Duplicates From a Sorted Array

**Difficulty:** Easy  
**Topics:** Array

### Approach

This solution uses a two pointer approach. A counter variable tracks the position of unique elements. A loop iterates through the array. If the element at the counter position equals the element at the loop position, no action is taken. If they are unequal, the value at the loop position is placed into the index one greater than the counter position, and the counter is incremented by 1. After the loop completes, the counter value incremented by one is returned, representing the total number of unique elements in the array.

### Time & Space

- **Time:** O(n)
- **Space:** O(1)


#### Problem Link
[LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array)
