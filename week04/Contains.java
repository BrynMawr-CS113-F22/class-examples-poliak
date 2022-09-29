// Author: Adam Poliak
// Date: 09/29
// Function to check if a string contains a character

public class Contains {
  
  public static boolean contains(String phrase, char c) {
    // your code here
    // algorithm: go through each character in phrase 
    //     for each character, check whether it is equal to c
    int count = 0; // keep track of how many times we see the character c
    for (int i = 0; i < phrase.length(); i++) {
      char currentChar = phrase.charAt(i);
      if (currentChar == c) {
        //return true;
        count += 1;
      }
    }
    return count > 0;
    //return false;
  }
  
  public static void main(String[] args) {
    boolean result = contains("lolcats", 'a');
    System.out.println(result); // should print true

    result = contains("lolcats", 'g');
    System.out.println(result); // should print false
  }
}
