//Majority Element
//Boyer-Moore Voting Algorithm
//Time Complexity:O(n)
//Space Complexity:O(1)

class Program{
  public static int majorityElement(int[] nums){
    int count=0;
    int element=-1;
    for(int num:nums) {
      if(count == 0){
        element=num;
        count++;
      }else if(num == element){
        count++;
      }else{
        count--;
      }
    }
    count=0;
    for(int num:nums){
      if(num==element){
        count++;
      }
    }
    return count>nums.length/2?element:-1;
  }
}
