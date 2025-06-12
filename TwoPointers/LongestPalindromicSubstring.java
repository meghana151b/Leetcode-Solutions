//LeetCode Solution: LongestPalindromic Substring
//Link:https://leetcode.com/problems/longest-palindromic-substring/

//Time Complexity:O(n)
//Space Complexity:O(1)


class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1 || s== null)
        return "";
        int start=0;
        int end = 0;

        for(int i=0;i<s.length();i++){
            int len1=expandCentre(s,i,i);
            int len2=expandCentre(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i - (len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int expandCentre(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
