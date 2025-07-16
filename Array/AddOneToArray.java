//Adding one to number epresented as Array

//Time complexity:O(n)
//Space Complexity:O(1)

class Program{
  public static int[] addArr(int[] arr){
    int carry=1;
    for(int i=arr.length-1;i>=0;i--){
      int sum=arr[i]+carry;
      arr[i]=sum%10;
      carry=sum/10;
    }
    if(carry>1){
      int[] newArr=new int[arr.length+1];
      newArr[0]=carry;
      System.arraycopy(arr, 0, newArr, 1,arr.length);
      return newArr;
    }
    return arr;
  }
}
