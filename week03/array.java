// Author: Adam Poliak
// Date: 09/20/2022
// Playing with arrays

public class array {
  public static void main(String[] args) {

    double[] sequence = new double[10];
    System.out.println(sequence[0]);
    System.out.println(sequence);

  

    // index out ouf bounds
    //System.out.println(sequence[100]);

    int[] sequenceInt = new int[10];
    for (int i = 0; i < sequenceInt.length; i++) {
      sequenceInt[2] = i+1;
      System.out.print(sequenceInt[i]);
    }
    System.out.println();
    for (int i = 0; i < sequenceInt.length; i++) {
      System.out.print(sequenceInt[i]);
    }
    //System.out.println(sequenceInt[2]);


    

  }
}
