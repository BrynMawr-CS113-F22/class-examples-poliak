// Author: Adam Poliak
// date: 09/20/2022

public class Backwards {
    // ask a user for 5 integers and then print the list of numebrs in reverse order

    public static void main(String[] args) {
        // we need to keep track of: the numbers that he user puts and their order

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Give me an integer");
            numbers[i] = Integer.parseInt(System.console().readLine());
        }

        // print them backwards
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(numbers[i-1]);
        }
        System.out.println();

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}
