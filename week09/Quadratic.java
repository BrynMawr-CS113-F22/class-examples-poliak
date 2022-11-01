public class Quadratic implements Function {

    double a;
    double b;
    double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //@Override
    public double evaluate(double x) {

        //ax^2 + bx + c
        Function square = new Square();
        return (a*square.evaluate(x)) + b*x + c;
    }

    public static void main(String[] args) {
        Function quadFunction = new Quadratic(1, 2, 3);
        System.out.println(quadFunction.evaluate(1));
    }

}