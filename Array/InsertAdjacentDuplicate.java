//Insert an adjacent duplicate number for all occurrences
//Time Complexity:O(n)
//Space Complexity:O(n)

class InsertAdjacent {
  public static List<Integer> insertDuplicate(int[] arr,int x){
    List<Integer> result = new ArrayList<>();
    for(int num:arr){
      result.add(num);
      if(num == x){
        result.add(num);
      }
    }
    return result;
  }
}
