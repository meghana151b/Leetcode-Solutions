//LeetCode Program:Is Subsequence
//Link:https://leetcode.com/problems/is-subsequence/description/?envType=problem-list-v2&envId=two-pointers

//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution{
  public static boolean isSubsequence(String s,String t){
    int i=0,j=0;
    while(i<s.length && j<t.length){
      if(s.charAt(i) == t.charAt(j)){
        i++;
      }
      j++;
    }
    return i==s.length;
  }

  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the string s");
    String s=scan.nextLine();
    System.out.println("Enter the string t");
    String t=scan.nextLine();
    scan.close();
    boolean result=isSubsequence(s,t);
    System.out.println(result);
  }
}
