class BubbleSort {
  public static void swap(int i, int j, int[] L) {
    // store the value in i-th index in a temporary variable
    // update the value in j-th index
    // update the value in the i-th index
  }
  
  public static void printList(int[] L) {
    for (int i = 0; i < L.length; i++) {
      System.out.print(L[i]+" ");
    }
    System.out.println();
  }
  

  /**
   * After each comparison of adjacent items, call printList(L);
   * After each iteration of our outer loop, print System.out.println("---------------");
   * @param L - the list to sort
   */
  public static void bubbleSort(int[] L) 
  {

  }
  
  public static void main(String[] args) {
    int[] L = {10, 4, 3, 0, 11, 8};
    printList(L);
    bubbleSort(L);
  }
  
}