// Author: Adam Poliak
// Date: Sep 06 2022
// Practice for code jam 1

public class codejam1Practice {

    public static void main(String[] args){

        System.out.println(Math.floor(Math.random() * 5));
        System.out.println(Math.floor(Math.random() * 5));

        System.out.println(48.0 % 2);

        //System.out.println("M/W " + Math.random() * 10);
        //System.out.println("T/Thursday" + Math.random() * 2);


        // Question 1
        //System.out.println(Math.pow(2, 3));

        //System.out.println(3.0 + 2);

        //Question 2
        // 1. Store two command line args
        // String firstCmdArg = args[0];
        // String secondCmdArg = args[1];

        // System.out.println(firstCmdArg + " " + secondCmdArg);
        // // 2. Convert them to integers
        // int firstCmdArgInt = Integer.parseInt(firstCmdArg);
        // int secondCmdArgInt = Integer.parseInt(secondCmdArg);

        // // 3. Output their sums
        // System.out.println(firstCmdArgInt + secondCmdArgInt);


        // Question 3.
        // // 1. Ask the user for a color and store it
        // System.out.println("Give me a color: ");
        // String color1 = System.console().readLine();
        // // 2. Repeat 1.
        // System.out.println("Give me a second color: ");
        // String color2 = System.console().readLine();
        // // 3. Repeat 2 (but adjective instead of color)
        // System.out.println("Give me a adjective: ");
        // String adj = System.console().readLine();

        // System.out.println("Roses are " + color1 + ", Violets are " + color2+ ", Sugar is " + adj + "  , and so are you!");

        int value = Integer.parseInt(args[0]);
        double fraction = value / 0;
        System.out.println("The fraction is "+fraction);
     
        // int arg1 = Integer.parseInt(args[0]);
        // int arg2 = Integer.parseInt(args[1]);
        // System.out.println(arg1 + arg2);
        // double fraction = value / 0;
        // System.out.println("The fraction is "+fraction);


    }
}