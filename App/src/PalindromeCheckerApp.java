public class PalindromeCheckerApp
    {
        /**
         *
         * MAIN CLASS- UeCase1PalindromeApp
         *
         * use case 1 : Application entry & welcome message
         *
         * description:
         * this class represents the entry point of the palindrome checker management system
         *
         * at this stage, the application:
         * -starts execution from the main() method
         * -displays a welcome message
         * -shows application version
         *
         * no palindrome logic is implemented yet
         *
         * the goal is to establish a clear startup flow
         * shailja
         * @version 1.0
         */

        public static void main(String args[])
        {
            System.out.println("Welcome to the Palindrome Checker Management System");
            System.out.println("version: 1.0");
            System.out.println("System initialized successfully");
            // 1. String Literal: Defining the hardcoded string
            String original = "madam";

            // 2. Data Structure (String): Reversing the string using StringBuilder
            // We create a new StringBuilder, reverse the content, and convert back to String
            String reversed = new StringBuilder(original).reverse().toString();

            // 3. Conditional Statement (if-else): Checking the palindrome condition
            // .equalsIgnoreCase() is used to ensure "Madam" would still match "madam"
            if (original.equalsIgnoreCase(reversed)) {
                // 4. Console Output: Displaying the success result
                System.out.println("The string \"" + original + "\" is a Palindrome.");
            } else {
                // 4. Console Output: Displaying the failure result
                System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
            }

            // Program exits automatically after the main method ends
        }
    }
