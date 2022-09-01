// Author: Adam Poliak
// Date: 09/01
// ask user for their fav food
// print our their favorite food and tell them what our favorite food

public class FavoriteFood{

    public static void main(String[] args){

        System.out.println("What is your name?");
        String name = System.console().readLine();


        System.out.print("Hi " + name + ",  what is your favorite food? ");
        String favFood = System.console().readLine();
        System.out.println(name  +"'s favorite food is " + favFood);


    }
}