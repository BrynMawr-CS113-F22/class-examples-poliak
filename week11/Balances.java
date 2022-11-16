// Adam Poliak
// 11/15/2022
// Class for holding customers balances

class Balances {
  
  public static void main(String[] args) {
    //  Playing with access modifiers of instance variables
    // Customer abhi = new Customer("abhi", 10000.0); 
    // System.out.println(abhi.name);
    // abhi.name = "john";
    // System.out.println(abhi);
  
    Customer[] customers = new Customer[1000];
    int customerCounter = 0;
    // read in csv file\
    // craete a collection (array) to store our customers
    In reader = new In("balances.csv");
    while (reader.hasNextLine()) {
      String currentLine = reader.readLine();
      String[] splitCurrentLine = currentLine.split(",");
      String name = splitCurrentLine[0];
      Customer currCustomer = new Customer(name, Double.parseDouble(splitCurrentLine[1]));
      System.out.println(currCustomer);
      customers[customerCounter] = currCustomer;
      customerCounter += 1;
      // System.out.println(currentLine.split(",").length);
      // System.out.println(reader.readLine());
      // System.out.println(reader.readLine());//.getClass());
      //make a new customer
      // extract the name and the balance for each customer
    }
    //System.out.println(reader.getClass());
    // sort the customers
    // selectionSort(customers);
    // print the customers
  }

  public static void swap(int i, int j, Customer[] L) {
  }
  
  public static void selectionSort(Customer[] L) {
  }
}
