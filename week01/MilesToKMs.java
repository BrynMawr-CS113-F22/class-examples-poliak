// Author: Adam Poliak
// Date: Sep 06 2022
// Convert miles to kms

public class MilesToKMs{

    public static void main(String[] args){

        // Prompt user
        System.out.println("Please enter the distance in miles: ");        

        // Read in user's response
        String milesAsString = System.console().readLine();

       // Stor response as a double
       double miles = Double.parseDouble(milesAsString);
        // Convert the miles to kms
        double KMs = miles * 1.6;

        // print out the answer to the user
        System.out.println("The distance in KMs is: " + KMs);

    }
}