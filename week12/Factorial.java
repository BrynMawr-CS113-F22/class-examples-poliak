public class Factorial {

    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);

        //base case: when we are at 1
        //rule: multiple teh number by the factorial of number subtracted by 1
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        assert factorial(4) == 24; 
        assert factorial(1) == 1;
        assert factorial(5) == 120;

        System.out.print(factorial(100000));
    }
}