import java.util.ArrayList;

class Cake {
  // what instance variables does a cake have?
  
  // how do we make a new cake?

  // how do we represent a Cake as a string?

  // how do we load Cakes?

  public static ArrayList<Cake> LoadCakes(String filename) {
    return null;
  }

  public static void SelectionSort(ArrayList<Cake> L) {
  }

  public static void main(String[] args) {

    ArrayList<Cake> cakes = LoadCakes("cakes.csv");

    SelectionSort(cakes);
    for (int i = 0; i < cakes.size(); i++) {
      System.out.println(cakes.get(i));
    }

  }
}