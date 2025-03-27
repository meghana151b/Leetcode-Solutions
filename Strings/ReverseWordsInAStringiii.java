//LeetCode Program:Reverse Words In aString iii
//Link:https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

//Time Complexity:O(n)
//Space Complexity:O(1)

//Used Two Pointers Approach

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();  // Convert string to char array
        int start = 0;  // Pointer to track the start of a word

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == ' ' || end == arr.length - 1) {
                int left = start;
                int right = (arr[end] == ' ') ? end - 1 : end; // Adjust for last word
                
                // Reverse the characters of the word using two pointers
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                // Move start pointer to the next word
                start = end + 1;
            }
        }

        return new String(arr);  // Convert back to string
    }
}
