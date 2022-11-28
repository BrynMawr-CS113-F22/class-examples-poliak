public class StackOverflow {

    public static void print() {
        System.out.println("hello");
        print();
    }

    public static void main(String [] args) {
        print();
    }
}