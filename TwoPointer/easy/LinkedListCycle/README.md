# Linked List Cycle

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers

### Approach

The solution is using two pointer approach. The fast pointer moves 2 steps at a time, the slow pointer moves 1 step. If there's a cycle, they'll eventually meet. If no cycle, fast reaches the end (null).

### Time & Space

- **Time:** O(n)
- **Space:** O(1)

#### Problem Link
[LeetCode](https://leetcode.com/problems/linked-list-cycle)
