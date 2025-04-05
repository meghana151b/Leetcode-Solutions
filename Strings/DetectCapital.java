// LeetCode Program: Detect Capital
//Link:https://leetcode.com/problems/detect-capital/?envType=problem-list-v2&envId=string

//time Complexity:O(n)
//Space Complexity:O(1)

class Solution {
    public boolean detectCapitalUse(String word) {
         int n = word.length();

        // Case 1: All uppercase
        boolean allUpper = true;
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) < 'A' || word.charAt(i) > 'Z') {
                allUpper = false;
                break;
            }
        }

        if (allUpper) return true;

        // Case 2: All lowercase
        boolean allLower = true;
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) < 'a' || word.charAt(i) > 'z') {
                allLower = false;
                break;
            }
        }

        if (allLower) return true;

        // Case 3: First letter capital, rest lowercase
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            for (int i = 1; i < n; i++) {
                if (word.charAt(i) < 'a' || word.charAt(i) > 'z') {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
  
