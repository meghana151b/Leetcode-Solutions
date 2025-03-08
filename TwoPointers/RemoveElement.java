//LeetCode Program: Remove Element
//LeetCode Link   : https://leetcode.com/problems/remove-element/submissions/1557242239/?envType=problem-list-v2&envId=two-pointers
//Time Complexity :O(n)
//Space Complexity:O(1)


class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0; // This pointer tracks where valid elements should go
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j]; //Move valid elements to position i
                i++;
            }
        }
        return i; // i represents new array length
        
    }
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of arrays");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter value to be removed");
        int val=sc.nextInt();
       int newLength= removeElement(nums,val);
        System.out.println("New Length: "+newLength);
        System.out.print("Modified array: ");
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
  
