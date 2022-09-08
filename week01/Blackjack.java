// Author: Adam Poliak
// Date: 09/08/22
// Blackjack from class

public class Blackjack{
    
    public static void main(String[] args) {
        
        // generate a number between 2 and 21 (both inclusive)
        int minVal = 2;
        int maxVal = 22;
        
        int range = maxVal - minVal;
        double randomDouble = Math.random() * range;
        int randomValue = (int) Math.floor(randomDouble) + minVal;
        
        System.out.println(randomValue);
        
        if (randomValue == 21) {
            System.out.println("Blackjack!");
        } else if (randomValue >= 17){
            System.out.println("Stand!");
        } else {
            System.out.println("Hit me!");
        }
    }
}