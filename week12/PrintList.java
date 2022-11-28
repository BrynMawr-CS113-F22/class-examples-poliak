public class PrintList {

    public static void printArray(int[] array) {
        printArray(array, 0);
        System.out.println("------");

    };

    public static void printArray(int[] array, int idx) {
        //base case
        if (idx == array.length) {
            return;
        }
        printArray(array, idx+1);
        System.out.print(array[idx]+",");
    }
    

    /** Recursively print a string
     * @param str
     */
    public static void printString(String str) {
        // base case
        if (str.length() == 0) {
            return;
        }
        System.out.print(str.charAt(0));
        printString(str.substring(1));
    }

    public static void main(String[] args) {
        int[] L = {2,4,10,20};
        int[] L1 = {200};
        int[] L2 = {};

        printArray(L);
        printArray(L1);
        printArray(L2);


        printString("hello");
    }
}