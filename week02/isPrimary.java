// Author: Adam Poliak
// Date: 09/13/2022
// Check if the color a user inputs is a primary color

public class isPrimary {
    
    public static void main(String[] args) {
        
        /*
        * 1. Ask user for a color
        * 2. Read in the users reponse and store response in a String variable
        * 3. compare response to the primary colors
        *  3a. if color is primary -> booyah (print color is primary)
        * 3b. if color isnt primary -> print out message
        */
        
        // Ask user for a color
        System.out.print("Give me a color, please: ");
        
        // Read in the users reponse and store response in a String variable
        String colorResponse = System.console().readLine();
        
        // compare response to the primary colors
        if (colorResponse.compareTo("yellow") == 0 ||
        colorResponse.compareTo("red") == 0 ||
        colorResponse.compareTo("blue") == 0) {
            System.out.println("Good job, you chose a primary color!");
        }
        else {
            System.out.println("You did not chose a primary color");
        }
        
    }
}