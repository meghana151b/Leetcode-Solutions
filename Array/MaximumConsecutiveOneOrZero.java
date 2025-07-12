import java.util.List;

class GfG {
    
    static int maxConsecBits(int[] arr){

        if (arr.length == 0)
            return 0;

        int maxCount = 0, count = 1;
        
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            
            // If the current element is the same as the previous one
            // increment the count
            if (arr[i] == arr[i - 1]) {
                count++;
            }
            
            // If not equal, update maxCount if needed and reset count
            else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);
    }

    public static void main(String[] args){

        int[] arr = { 0, 1, 0, 1, 1, 1, 1 };

        System.out.println(maxConsecBits(arr));
    }
}
