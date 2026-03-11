public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        // 1. Define the input string
        String input = "radar";

        // 2. Data Structure: Convert string to a primitive Character Array (char[])
        char[] charArray = input.toCharArray();
        // 1. Data Structure: Initialize a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // 3. Two-Pointer Technique: Initialize pointers at start and end
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;
        // 2. Push Operation: Insert each character into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        //

        // 4. Compare start & end characters using a while loop
        while (left < right) {
            // Check if characters at the current pointers match
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Stop immediately if a mismatch is found
            }
            // Move pointers toward the middle
            left++;
            right--;
            // 3. Reversal Logic: Pop characters to build the reversed string
            String reversed = "";
            while (!stack.isEmpty()) {
                // Pop removes the top element (the last character pushed)
                reversed += stack.pop();
            }

            // 5. Display the result
            if (isPalindrome) {
                System.out.println("The word \"" + input + "\" is a Palindrome.");
                // 4. Compare and Print Result
                if (input.equalsIgnoreCase(reversed)) {
                    System.out.println("The string \"" + input + "\" is a Palindrome.");
                } else {
                    System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
                    System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
                }
            }
        }