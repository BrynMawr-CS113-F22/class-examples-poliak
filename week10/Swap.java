// Adam Poliak
// 11/10/2022
// Example swapping values in an array

class Swap {

  public static void print(int[] L) {
    for (int i = 0; i < L.length; i++) {
      System.out.print(L[i]+" ");
    } 
    System.out.println();
  }

  public static void main(String[] args) {
    int[] L = {-2, 3, 5};
    print(L);
    int temp = L[1];
    L[1] = L[0]; // -2, -2 5
    print(L);
    L[0] = temp; //-2, -2, 5
    print(L);
    
  }
}
