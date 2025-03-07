//LeetCode Program:Reverse String
//Link:https://leetcode.com/problems/reverse-string/description/?envType=problem-list-v2&envId=two-pointers
//Time Complexity:O(n)
//Space Complexity:O(1)

class Solution{
  public static void main(String[] args ){
    
    //Taking input from user
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();

     // Convert string to character array (since strings are immutable)
    char[] charArray=s.toCharArray();
    
      // Reverse the string using two pointers
    reverseString(charArray);
    
       // Convert char array back to string
    String reversed=new String(charArray);
    System.out.println("Reversed String: "+reversed);
    sc.close();
    
  }
  public static void reverseString(char[] s){
    int left=0,right=s.length-1;
    //Swap Characters
    while(left<right){
      char temp=s[left];
      s[left]=s[right];
      s[right]=temp;
      
//Move Pointers
      left++;
      right--;
    }
  }
}
