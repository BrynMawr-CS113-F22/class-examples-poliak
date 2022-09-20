// Author: Adam Poliak
// date: 09/15/2022
// Print out the pattern from class based on the number that a user puts in

public class LoopPattern {
    public static void main(String[] args) {


        System.out.println("How many patterns do you want?");
        int numPatterns = Integer.parseInt(System.console().readLine());

        for (int countPatterns = 0; countPatterns < numPatterns; countPatterns++) {

            System.out.print("Enter a length: ");
            int length = Integer.parseInt(System.console().readLine());

            String message = "";
            //initiliaze, condition, increment
            for (int count = 0; count < length; count += 1) {

                // every even time, concatenate a *
                // every odd time, concacetate a _

                if (count % 2 == 0) {
                    message += "*";
                } else {
                    message += "_";
                }
            }
            System.out.println(message);
        }
    }


}
