// Author: Adam Poliak
// Date: 09/08/22
// check if an inputted number is even


public class isEven{

    public static void main(String[] args){

        // 1. ask user for a integer
        System.out.println("Enter an integer: ");

        // 2. reada in and convert the number to an integer
        String response = System.console().readLine();
        int number = Integer.parseInt(response);
        // 3. check if the number is even

        if (number % 2 == 0) {
            System.out.println(number + " is even!");
        }
        else {
            System.out.println(number + " is odd");
        }

    }


}