class Contains {
  
  public static boolean contains(String phrase, char c) {
    // your code here
    // algorithm: go through each character in phrase 
    //     for each character, check whether it is equal to c
    return true;
  }
  
  public static void main(String[] args) {
    boolean result = contains("lolcats", 'a');
    System.out.println(result); // should print true

    result = contains("lolcats", 'g');
    System.out.println(result); // should print false
  }
}
