public class CheckInput {

    /*
     * Checks if the input string is empty
     * @param input: the input string
     * @return true if the string is empty, otherwise false
     */
    public static boolean isEmpty(String input) {
        return input.length() == 0;
    }

    /*
     * Checks if a string is an integer or not
     * @param input: the string under consideration
     * @return true if the string is an integer, otherwise false 
     */
    public static boolean isInteger(String input) {
        /*
        * Algorithm:
        * - check if the first character is a negative sign
        * - go through each character in the string one at a time
        *   -  if the char is not a digit
        *       - return false
        * - return true if all characters are digits
        */

        // Return false if the string is empty 
        if (isEmpty(input)) {
            return false;
        }

        int startingIndex = 0;
        if (input.charAt(0) == '-') {
            startingIndex = 1;
        } 
        for (int i = startingIndex; i < input.length(); i++) {
            char curChar = input.charAt(i);
            /* This approach would check if the character is not a 1, 2, 3, or ...
             if (curChar != '1' && curChar != '2' && curChar != '3') { // ... {
                     return false;
            }
            */
            // check the ASCII values of the character. 
            if (curChar < '0' || curChar > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // char c = '7';
        // System.out.println(c);
        // int cAscii = (int) c;
        // System.out.println(cAscii);

        System.out.println(isInteger("123"));   // true
        System.out.println(isInteger("1.234")); // false;
        System.out.println(isInteger("abc"));  // false
        System.out.println(isInteger("12s"));  // false
        System.out.println(isInteger("-012"));  // true
        System.out.println(isInteger(""));  // false

        

    }
    
}
