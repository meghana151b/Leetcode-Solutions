//Program:Stock Buy and Sell
//Time Complexity:O(n)
//Space Complexity:O(1)

class Program {
  public static int stock(int[] arr){
    int n=arr.length;
    int profit=0;
    for(int i=1;i<n;i++){
      if(arr[i]>arr[i-1]){
        profit += arr[i] - arr[i-1];
      }
    }
    return profit;
  }
}
