// Adam Poliak
// 11/01/2022
// Use the function classes that implement the function interface

public class Functions {


    public static void main(String[] args) {
        Function[] listOfFunctions = {new Square(), new Quadratic(1, 2, 3)};
        for (int i = 0; i < listOfFunctions.length; i++) {
            System.out.println(listOfFunctions[i].evaluate(2));
        }
    }
}
