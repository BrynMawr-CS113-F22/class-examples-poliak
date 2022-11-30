import java.util.ArrayList;
import  java.io.Console;

// Write a program that stores values in a list 
// until the user presses "RETURN", i.e. until they put in an empty string
// then print all the values that are less than the avergae

class Average {
  public static void main(String[] args) {

    ArrayList<Integer> values = new ArrayList<Integer>();


    // until the user quits
    boolean timeToQuit = false;
    while (!timeToQuit) {
        System.out.println("Enter an integer, or 'RETURN");
        // Classname.method - this is for static methods
        // object.method - this is for instance methods
        Console console = System.console();
        String input = console.readLine();
        if (input.equals("")) {
            timeToQuit = true;
        } else {
            int value = Integer.parseInt(input);
            values.add(value);
        }
    }
    // compute average
    double sum = 0.;
    for (int i = 0; i < values.size(); i++) {
        sum += values.get(i);
    }
    double avg = sum / values.size();
    System.out.printf("Avergate value is %f\n", avg);

    for (int i = 0; i < values.size(); i++) {
        if (values.get(i) < avg) {
            System.out.printf("%d is smaller than the average\n", values.get(i));
        }
    }
    System.out.println(sum);


    // once the user quits
    // compute the average = sum / size
    // print out all values that are smaller than the average
    
    

  }
}