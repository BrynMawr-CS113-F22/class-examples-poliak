import java.util.Scanner;

public class RedirectIn {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.console.readLine();

        // lets comment these lines together in class
        // before running the code
        int numInputs = Integer.parseInt(scanner.nextLine());  // read the first line of input and converting it into a integer
        for (int i = 0; i < numInputs; i++) {
        String input = scanner.nextLine(); // read in the next line
         System.out.println(input); // print out whatever was read in
 }
}        
}
