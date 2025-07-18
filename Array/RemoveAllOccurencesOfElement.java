//Remove All occurrence of an element in an array

//Time Complexity:O(n)
//Space Complexity:O(1)

class Program{
  public static int removeEle(int[] arr,int ele){
    int k=0;
    for(int i=0;i<arr.length;i++){
      int k=0;
      if(arr[i] != ele){
        arr[k]=arr[i];
        k++;
      }
    }
    return k;
  }
}
