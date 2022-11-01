public class Square implements Function {

    public double evaluate(double x) {
        return x*x;
    }
    public static void main(String[] args) {

        Function square = new Square();
        System.out.println(square.evaluate(4));

    }
}