//LeetCode Program:Number of Distinct Averages
//Link:https://leetcode.com/problems/number-of-distinct-averages/?envType=problem-list-v2&envId=two-pointers

//Time complexity:O(n log n)
//Space Complexity:O(n)

class Solution{
  public static void distinctAvg(int[] nums){
    Arrays.sort(nums);
    HashSet<Double>set=new HashSet<>();
    int left=0,right=nums.length-1;
    while(left<right){
      double avg=(nums[left]+nums[right])/2.0;
      set.add(avg);
      left++;
      right--;
    }
    return set.size();
  }
}
