public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base index before any valid substring
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);  // Push index of '('
            } else {
                stack.pop();    // Pop the matching '(' index
                if (stack.isEmpty()) {
                    stack.push(i);  // Reset base if unmatched ')'
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestValidParentheses("(()"));       // Output: 2
        System.out.println(sol.longestValidParentheses(")()())"));    // Output: 4
        System.out.println(sol.longestValidParentheses(""));          // Output: 0
    }
}
