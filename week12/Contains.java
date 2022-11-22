public class Contains {
   
    /** Global function determing if a string contains a charater
     * @param x
     * @param phrase
     * @return
     */
    public static boolean contains(char x, String phrase) {
      return false;
    }

    /** Recursion function implementing contains
     * @param x
     * @param phrase
     * @param i
     * @return
     */
    private static boolean contains(char x, String phrase, int i) {
      return false;
    }
    
    public static void main(String[] args) {
        String phrase = "apple";

        System.out.printf("contains(%c, %s) = %b\n", 
          'a', phrase, contains('a', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'z', phrase, contains('z', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'l', phrase, contains('l', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'e', phrase, contains('e', phrase));

        System.out.printf("contains(%c, %s) = %b\n", 
          'e', "", contains('e', ""));
    }
}
