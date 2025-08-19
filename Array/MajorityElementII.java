//Program: Majority Element II
//Time Complexity:O(n)
//Space Complexity:O(1)

class Program {
  public List<Integer> majorityElement(int[] arr) {
    int candidate1=0,candidate2 =0;
    int count1=0,count2=0;

    for(int num:arr){
      if(num == candidate1){
        count1++;
      } else if(num == candidate2) {
        count2++;
      }
      else if(count1 == 0){
        candidate1 = num;
        count1=1;
      } else if(count2 == 0){
        candidate2 = num;
        count2=1;
      } else {
        count1--;
        count2--;
      }
    }
    count1=0;
    count2=0;

    for(int num:arr) {
      if(num == candidate1){
        count1++;
      } 
      else if(num == candidate2){
        count2++;
      }
    }
    List<Integer> result = new ArrayList<>();
    if(count1>n/3)
      result.add(candidate1);
    if(count2>n/3)
      result.add(candidate2);

    return result;
  } 
}
