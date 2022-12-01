public class Frame {

    public static int add(int x, int y) {
        int result = x + y;
        x = x*2;
        return x + y;
    }

    public static  int removeLast(int[] numberz) {
        int number = numberz[numberz.length - 1];
        numberz[numberz.length - 1] = 0;
        return number;
    }

    public static void main(String[] args) {
        //int x = 0;

        int[] numbers = {1,2,3,4};

        add(numbers[0], numbers[1]);

        System.out.println(numbers[3]);
        removeLast(numbers);
        System.out.println(numbers[3]);

        int x = 5;
        int y = 4;
        add(x, y);

        String name = "hello";
        System.out.println(name);
        System.out.println(numbers);
    }
}
