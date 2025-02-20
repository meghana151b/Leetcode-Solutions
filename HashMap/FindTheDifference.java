LeetCode Program:Find the Difference
Program Link: https://leetcode.com/problems/find-the-difference/



class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> charCount=new HashMap<>();

        for(char c:s.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);

        }
        for(char c: t.toCharArray()){
            if(!charCount.containsKey(c) || charCount.get(c)==0){
return c;
            }
            charCount.put(c,charCount.get(c)-1);
        }
        return ' ';
        
    }
}
