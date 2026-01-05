# Segregate 0s and 1s

**Difficulty:** Easy  
**Topics:** Array, Two Pointers

### Approach

This problem requires a two pointer approach. Initialize a `pointer` variable to track the position where the next 0 should be placed (starting at index 0). Run a loop to iterate through the array from index 0 to the end. In each iteration, check if the current element `arr[i]` equals 0. If yes, swap the element at index `i` with the element at the `pointer` position using a temporary variable `temp`, then increment the `pointer` by 1. This ensures all 0s are moved to the left side of the array while maintaining the relative order. By the end of the loop, all 0s will be on the left and all 1s will be on the right.

### Time & Space

- **Time:** O(n)
- **Space:** O(1)


#### Problem Link
[GeeksForGeeks](https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1)
