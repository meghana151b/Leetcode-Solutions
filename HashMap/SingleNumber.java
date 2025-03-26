//LeetCode Program:Single Number
//Link:https://leetcode.com/problems/single-number/?envType=problem-list-v2&envId=array

//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution {
    public int singleNumber(int[] nums) {
      //Creating HashMap
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1); //Storing frequency of each number
        }
        for(int n:nums){
            if(map.get(n)==1){  //Find the number that appears only once
                return n; // return the number
            }
        }
        return -1;
        
    }
}
