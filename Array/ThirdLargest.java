//Program:Third Largest
//Time Complexity:O(n)
//Space Complexity:O(1)

class Third{
  public static int thirdLargest(int[] arr){
    int n=arr.length;
    int first=-1,second=-1,third=-1;
    for(int i=0;i<n;i++){
      if(arr[i]>first){
        third=second;
        second=first;
        first=arr[i];
      }
      else if(arr[i]>second){
        third=second;
        second=arr[i];
      }
      else if(arr[i]>third){
        third=arr[i];
      }
    }
    return third;
  }
}
