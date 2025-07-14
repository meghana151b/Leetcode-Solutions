//Program:Reverse Array in Groups

//Time Complexity:O(n)
//Space Complexity:O(1)

import java.util.Arrays;

public class ReverseInGroups {

    public static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the sub-array from left to right
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        reverseInGroups(arr, k);

        System.out.println("Reversed in groups: " + Arrays.toString(arr));
    }
}
