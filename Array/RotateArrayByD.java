//Program:Rotate an Array by D left

//Time Complexity:O(n)
//Space Complaxity:O(1)

import java.util.Arrays;

public class RotateArrayLeft {

    // Function to reverse part of array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Rotate array to the left by d positions
    static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // in case d > n

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining n - d elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        rotateLeft(arr, d);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
