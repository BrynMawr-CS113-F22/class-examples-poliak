// Author: Adam Poliak
// Date: 09/13/2022
// Compute the sum of 6 numbers (without loops - dont do this!)

public class sumOf6Numbers {

    public static void main(String[] args) {

        //Ask user for 6 numbers and output their sum
        int total = 0;

        System.out.println("Give me a number: ");
        int inputNumber = Integer.parseInt(System.console().readLine());
        total = total + inputNumber;

        System.out.println("Give me a number: ");
        inputNumber = Integer.parseInt(System.console().readLine());
        total = total + inputNumber;

        System.out.println("Give me a number: ");
        inputNumber = Integer.parseInt(System.console().readLine());
        total = total + inputNumber;

        System.out.println("Give me a number: ");
        inputNumber = Integer.parseInt(System.console().readLine());
        total = total + inputNumber;

        System.out.println("Give me a number: ");
        inputNumber = Integer.parseInt(System.console().readLine());
        total = total + inputNumber;

        System.out.println("Give me a number: ");
        inputNumber = Integer.parseInt(System.console().readLine());
        total = total + inputNumber;

        System.out.println("Your total is: " + total);
    }
}