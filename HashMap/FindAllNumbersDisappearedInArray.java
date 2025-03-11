//LeetCode Program:Find all Numbers Disappeared in an Array
//Link:https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/?envType=problem-list-v2&envId=hash-table

//Time Complexity:O(N)
//Space Complexity:O(N)

class Solution{
  public List<Integer> findDisappearedNumbers(int[] nums){
    Set<Integer> map=new Hashset<>();
    for(int num:nums){
      map.add(num);
    }

  List<Integer> missingNumbers=new LinkedList<>();
    for(int i=1;i<=nums.length;i++){
      if(!map.contains(i)){
        missingNumbers.add(i);
      }
    }
    return missingNumbers;
  }
}
