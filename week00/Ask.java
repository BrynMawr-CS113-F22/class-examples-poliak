// Author: Adam Poliak
// Date: 09/01

// Ask a question to a user (what is your name)?
// ask that person (using their name) how they are doing

public class Ask{

    public static void main(String[] args){

        System.out.println("What is your name?");
        String name = System.console().readLine();
        System.out.println(name + ", how are you doing?");
    }

}