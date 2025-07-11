//Program:Second Largest
//Time Complexity:O(n)
//Space Complexity:O(1)

class Second{
  public static int secondLargest(int[] arr){
    int n=arr.length;
    int largest=-1,seclargest=-1;
    for(int i=0;i<n;i++){
      if(arr[i]>largest){
        seclargest=largest;
        largest=arr[i];
      }
      else if(arr[i]<largest && arr[i]>seclargest){
        seclargest=arr[i];
      }
    }
    return seclargest;
  }
}
