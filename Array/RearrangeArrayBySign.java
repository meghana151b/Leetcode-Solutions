//Rearrange Array Elements by sign

//Time Complexity:O(n)
//Space Complexity:O(n)

class Rearrange{
  public static int[] rearrangeArray(int[] nums){
    int n=arr.length;
    int[] result=new int[n];

    int posIndex=0;
    int negIndex=1;

    for(int num:nums){
      if(num>0){
        result[posIndex]=num;
        posIndex += 2;
      }else{
        result[negIndex] += 2;
        negIndex += 2;
      }
    }
    return result;
  }
}
