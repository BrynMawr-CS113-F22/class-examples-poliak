class SelectionSort {
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
  
  public static void selectionSort(int[] L) 
  {
    // for every index:
      // find the smallest value in the sublist starting at the index
      // move the smallest value to the front of the sublist
      // printList(L) after every swap

  }
  
  public static void main(String[] args) {
    int[] L = {10, 4, 3, 0, 11, 8};
    printList(L);
    selectionSort(L);
  }
}