// Author: Adam Poliak
// Date: 09/13/2022
// Bad example of comparing strings. Use "compareTo()" instead

public class badStringComparison {

    public static void main(String[] args) {

        String a1 = "a";
        //String a2 = new String("a");
        String aCommandLine = args[0];
        String a3 = "a";

        System.out.println("a1 is " + a1);
        //System.out.println("a2 is " + a2);
        System.out.println("a3 is " + a3);

        if (a1 == a3) {
            System.out.println("a1 and a3 are the same");
        }

        System.out.println("aCommand line is: " + aCommandLine);

        if (a1 == aCommandLine) {
            System.out.println("a1 and aCommandLine are the same!");
        }
       

        // if (a1 == a2) {
        //     System.out.println("a1 and a2 are the same");
        // }

        
    }
}