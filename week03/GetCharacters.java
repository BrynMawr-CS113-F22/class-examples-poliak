// Author: Adam Poliak
// date: 09/20/2022
// Prrint th emiddle character in each string passed in as a command line argument

public class GetCharacters {
    public static void main(String[] args) {

        // hard code a word and print uout the first, middle, and last character

       
        for (int i = 0; i < args.length; i++) {
            int middleIndex = args[i].length() / 2;
            char middleChar = args[i].charAt(middleIndex);
            System.out.printf("MiddleIndex: %d\t FirstCharacter %s\n", middleIndex, middleChar);
        }

    }
}
