//Program: Missing range of numbers
//Time Complexity:O(n)
//Space Complexity:O(1)

class Program{
  public static List<int[]> missingNumbers(int[] arr,int lower,int upper){
    List<int[]> result = new ArrayList<>();
    int prev=lower-1;
    for(int i=0;i<=arr.length;i++){
      int curr = (i<arr.length)?arr[i]:upper-1;
      if(curr-prev<=2){
        result.add(int[]{prev+1,curr-1});
      }
      prev=curr;
    }
    return result;
    
  }
  
}
