//LeetCode solution:LongestSubstringWithoutAnyRepeatingCharacter.java
//Link:https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

//Time Complexity:O(n^2)
//Space Complexity:O(1)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLength= Math.max(maxLength,right-left+1 );
        }
        return maxLength;
    }
}
