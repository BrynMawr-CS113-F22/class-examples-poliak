import java.lang.System.*;

class SortPerformance {
  public static void swap(int i, int j, int[] L) {
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
  
  public static void bubbleSort(int[] L) 
  {
    for (int n = 0; n < L.length; n++) {
      for (int j = 1; j < L.length-n; j++) {
        if (L[j-1] > L[j]) {
          swap(j-1, j, L);
        }
      }
    }
  }

  public static void selectionSort(int[] L) 
  {
    for (int i = 0; i < L.length; i++) {
      int minIdx = i;
      for (int j = i+1; j < L.length; j++) {
        if (L[j] < L[minIdx]) {
          minIdx = j; 
        }
      }
      swap(i, minIdx, L);
    }
  }

  public static double SelectionSortPerformance(int n) {
    double totaltime = 0.0;
    int totalRuns = 5;
    
    for (int runs = 0; runs < totalRuns; runs++) {
        int[] L = new int[n];
        for (int i = 0; i < n; i++)
        {
          int v = (int) (Math.random()*50.0);
          L[i] = v;
        }
        //printList(L);
        
        double start = System.currentTimeMillis()/1000.0; // converts to seconds
        selectionSort(L);
        double end = System.currentTimeMillis()/1000.0;

        System.out.printf("Time: %.10f\n", (end-start));
        totaltime += (end-start);
    } 
    System.out.printf("Average time to sort took %.10f\n", totaltime / totalRuns);
    return totaltime / totalRuns;
  }
  
  public static void main(String[] args) {
    //int n = Integer.parseInt(args[0]);
    int n = 10000; // 10k
    SelectionSortPerformance(n);
    //O(n^2)
    // if we double the size of our list, how much longer should it take to sort the list?
    SelectionSortPerformance(n * 2); 

    SelectionSortPerformance(n * 3);

    
  }
}

