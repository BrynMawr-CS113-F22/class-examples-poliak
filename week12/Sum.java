public class Sum {

    public static int sum(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sum(number - 1);
    }

    public static void main(String[] args) {
        assert sum(1) == 1;
        assert sum(5) == 5 + 4 + 3 + 2 + 1;
        System.out.println(sum(5));

    }
}