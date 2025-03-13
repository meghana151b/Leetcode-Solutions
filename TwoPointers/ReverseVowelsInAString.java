//LeetCode Program:Reverse Vowels in a String
//Link: https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1572715617/?envType=problem-list-v2&envId=two-pointers

//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution {
    public String reverseVowels(String s) {
      // Set of vowels (both uppercase and lowercase)
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] chars=s.toCharArray(); // Convert string to char array
        int left=0, right=chars.length-1;
        while(left<right){
            // Move left pointer forward if not a vowel
            while(left<right && !vowels.contains(chars[left])){
                left++;
            }
            // Move right pointer backward if not a vowel
            while(left<right && !vowels.contains(chars[right])){
                right--;
            }
          // Swap the vowels
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            // Move pointers
            left++;
            right--;
        }
        return new String(chars);// Convert char array back to string    
    }
}
