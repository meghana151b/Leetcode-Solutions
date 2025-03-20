//Leetcode Solutions:Contains Duplicate
//Time complexity:O(n)
/Space Complexity:O(1)



class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}
