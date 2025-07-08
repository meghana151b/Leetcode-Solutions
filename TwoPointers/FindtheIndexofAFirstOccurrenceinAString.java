//LeetCode Solution: 28. Find the Index of the First Occurrence in a String
//Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=two-pointers
//
//Time Complexity:O(m*n) (worst)
//Space Complexity:O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();

        for(int i=0;i<=m-n;i++){
            int j=0;
            while(j<n && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==n){
                return i;
            }
        }
        return -1;
    }
}
