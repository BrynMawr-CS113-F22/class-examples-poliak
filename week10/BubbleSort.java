// Adam Poliak
// 11/10/2022
// In class bubble sort, there is one small thing incorrect in the implementation

class BubbleSort {
  public static void swap(int i, int j, int[] L) {
    // store the value in i-th index in a temporary variable
    // update the value in j-th index
    // update the value in the i-th index
    int tmp = L[i];
    L[i] = L[j];
    L[j] = tmp;
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
  //this implemention is off a bit, fix it for homework
  public static void bubbleSort(int[] L) 
  {
    for (int endIndex = L.length - 1; endIndex > 1 ; endIndex -= 1) {

      for (int j = 1; j < endIndex + 1; j++) {
        if (L[j] < L[j-1]) {
          swap(j-1, j, L);
        }
        printList(L);
      }
      System.out.println("---------------");
    }

  }
  
  public static void main(String[] args) {
    int[] L = {10, 4, 3, 0, 11, 8, -1};
    printList(L);
    //swap(0, 1, L);
    //printList(L);
    bubbleSort(L);
  }
  
}