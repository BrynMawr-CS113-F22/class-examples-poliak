// Adam Poliak
// 10/20/2022
// Example from class using an instance method from the String class

public class Methods{

    public static void main(String[] args) {
        String one = "adam";
        String two = "david";
        System.out.print(one.compareTo(two));
        String.compareTo(one); // this will not work because compareTo is not a static method
    }
}