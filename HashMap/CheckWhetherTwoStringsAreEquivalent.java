//LeetCode Program:CheckWhetherTwoStringsAreEquivalent
//Link:https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/description/?envType=problem-list-v2&envId=string

//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:word1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:word2.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int diff:map.values()){
            if(Math.abs(diff)>3){
                return false;
            }
        }
        return true;
    }
}
