//LeetCode Program:Duplicate Zeros
//Link:https://leetcode.com/problems/duplicate-zeros/?envType=problem-list-v2&envId=two-pointers

//Time Complexity:O(N)
//Space Complexity:O(1)
//Used Two Pointers Approach

class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int countZeros = 0;

        // Count the number of zeros
        for (int num : arr) {
            if (num == 0) countZeros++;
        }

        int i = n - 1, j = n + countZeros - 1;

        // Traverse from the end and shift elements
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i]; // Copy element if within bounds
            }
            j--;

            if (arr[i] == 0) { // If zero, duplicate it
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }
            i--;
        }
    }
}
