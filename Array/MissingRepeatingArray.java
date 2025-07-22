//Missing and Repeating in an Array
//Time Complexity:O(n)
//Space Complexity:O(1)

class Program{
  public static ArrayList<Integer> findTwo(int[] arr){
    int n =arr.length;
    int missing=-1,repeating=-1;
    for(int i=0;i<n;i++){
      int index=MAth.abs(arr[i])-1;
      if(arr[index]<0){
        repeating=Math.abs(arr[i]);
      }else{
        arr[index] = -arr[index];
      }
    }
    for(int i=0;i<n;i++){
      if(arr[i]>0){
        missing=i+1;
        break;
      }
    }
    ArrayList<Integer> result=new ArrayList<>();
    result.add(repeating);
    result.add(missing);
    return result;
  }
  
}
