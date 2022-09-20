// Author: Adam Poliak
// date: 09/15/2022
// Compute exponent of 2 using a while loop!

public class LoopPow2 {

    public static void main(String[] args) {

        // Ask user for an exponent
        // read in the exponent and convert it from a string to init
        System.out.println("Give me an exponent, now!");
        String answer = System.console().readLine();
        int exponent = Integer.parseInt(answer);

        // int exponent = Integer.parseInt(System.console().readLine());

        // compute the exponent!
        // we have multiply 2 to itself n times (where n is the exponent)

        // condition 
        // need to keep track of:
        //  - accumulator variable
        // - count, number of iterations completed

        int count = 0;
        int total = 1;

        while (count < exponent) {
            total *= 2;
            count += 1;
        }
        System.out.println("2 to the power of " + exponent + " is " + total);

        total = 1;
        for (int countFor = 0; countFor < exponent; countFor+= 1) {
            total *= 2;
        }
        System.out.println("2 to the power of " + exponent + " is " + total);










    }
    
}
