//Wave Array
//Time Complexity:O(n)
//Space Complexity:O(1)

import java.util.*;

class Solution{
    
    void sortInWave(int arr[]){
        
        int n = arr.length;
        
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    // Driver method
    public static void main(String args[]){
        
        Solution so = new Solution();
        int arr[] = {1, 2, 3, 4, 5};
        so.sortInWave(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
