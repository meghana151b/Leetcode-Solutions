//LeetCode Program:22. Generate Parentheses
//Link:https://leetcode.com/problems/generate-parentheses/description/

//Time Complexity:O(2^n * n)
//Space Complexity:	O(C_n * n)


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result =new ArrayList<>();
        generate("",0,0,n,result);
        return result;
    }
    public void generate(String current,int open,int close,int n,List<String> result){
        if(current.length() == n*2){
            result.add(current);
            return;
        }
        if(open<n){
            generate(current+"(",open+1,close,n,result);
        }
        if(close<open){
            generate(current+")",open,close+1,n,result);
        }
    }
}
