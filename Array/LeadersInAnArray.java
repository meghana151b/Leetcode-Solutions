//Leaders in an Array:An element is a Leader if it is greater than or equal to all the elements to its right side.
//Time Complexity:O(n)
//Space Complexity:O(k)
class Main{
  public static List<Integer> findLeaders(int[] arr){
    List<Integer> result=new List<>();
    int n=arr.length;
    int maxFromRight=arr[n-1];
    result.add(maxFromRight);
    for(int i=arr[n-2];i>=0;i--){
      if(arr[i]>=maxFromRight){
        maxFromRight=arr[i];
        result.add(maxFromRight);
      }
    }
    Collections.reverse(result);
    return result;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr=new int[n];
    List<Integer> result=findLeaders(arr);
    System.out.println(result);
  }
}
