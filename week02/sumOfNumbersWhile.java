// Author: Adam Poliak
// Date: 09/13/2022
// Compute the sum of 6 numbers using a while loop

public class sumOfNumbersWhile {

    public static void main(String[] args) {

        int count = 0; // keep track of current nstate (aka number of iterations ran so far)
        int total = 0;

        while (count >= 0) {
            System.out.print("Enter a number: ");
            int val = Integer.parseInt(System.console().readLine());
            total = total + val; //updateing our sum
            count = count + 1;
        }

        System.out.println("The total sum is: " + total);
    }
}