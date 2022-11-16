// Adam Poliak
// 11/15/2022
// Class for holding customers balances

class Customer {

  private String name;
  private double balance;
  
  public Customer(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }  

  public String getName() {
    return this.name;
  }

  public double getBalance() {
    return this.balance;
  }

  public String toString() {
    return this.name+" "+this.balance;
  }

  public static void main(String[] args) {
    Customer abhi = new Customer("abhi", 10000.0); 
    System.out.println(abhi.getName()); // "abhi"
    System.out.println(abhi.getBalance()); //10000.0

    // In class we spoke about assert statements
    // In order for the assert to run, make sure to use the -ea flag
    // For example, when running "java -ea Customer", the assert of line 26 will fail
    // and the message "Abhi's balance is not 9k" will be printed
    assert abhi.getBalance() == 10000.0 : "Abhi's balance is not 10k";
    assert abhi.getBalance() == 9000.0 : "Abhi's balance is not 9k";

    //assert abhi.getBalance() == "abhi";

  }
}
