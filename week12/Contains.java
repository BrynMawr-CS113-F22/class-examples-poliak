public class Contains {
   
    /** Global function determing if a string contains a charater
     * @param x
     * @param phrase
     * @return
     */
    public static boolean contains(char x, String phrase) {
       return contains(x, phrase, 0);
    }

    /** Recursion function implementing contains
     * @param x
     * @param phrase
     * @param i
     * @return
     */
    private static boolean contains(char x, String phrase, int i) {
      if (i == phrase.length()) {
        return false;
      }
    // Check backwards
    //   boolean found = contains(x, phrase, i+1);
    //   System.out.println(phrase.charAt(i));
    //   if (phrase.charAt(i) == x) {
    //     return true;
    //   }
    //   return found;

    if (i == phrase.length()) {
        return false;
      }
      System.out.println(phrase.charAt(i));
      if (phrase.charAt(i) == x) {
        return true;
      }
      return contains(x, phrase, i + 1);
  
    }
    
    public static void main(String[] args) {
        String phrase = "apple";

        System.out.printf("contains(%c, %s) = %b\n", 
          'a', phrase, contains('a', phrase));  //true

        System.out.printf("contains(%c, %s) = %b\n", 
          'z', phrase, contains('z', phrase)); //false

        System.out.printf("contains(%c, %s) = %b\n", 
          'l', phrase, contains('l', phrase)); //true

        System.out.printf("contains(%c, %s) = %b\n", 
          'e', phrase, contains('e', phrase)); //true

        System.out.printf("contains(%c, %s) = %b\n", 
          'e', "", contains('e', "")); //false
    }
}
