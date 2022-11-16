// Adam Poliak
// 11/10/2022
// Binary Search Implementation

class BinarySearch {

    // Search for the value x in the list L using binary search
    // Input x: the value to search for (int)
    // Input L: an array containing values
    // Returns (int): the index of x in L; -1 if x is not in L
    public static int search(int x, int[] L) {
        int low = 0; // what is the low index?
        int high = L.length - 1; // what is the high index?
        while (low <= high) { // what condition do we stop?
            int mid = (low + high) / 2; // what is the middle index?
            System.out.println(mid);
            System.out.println(low + " " + mid + " " + high + " " + L[mid]);
            
            if (L[mid] < x) { // condition 1
                ///
                low = mid + 1;
                mid = (low + high) / 2;
            }
            else if (L[mid] > x) { //condition 2
               ///
               high = mid - 1;
               mid = (low +  high) / 2;
            }
            else { // found the value
               return mid; 
            }
            System.out.println(low + " " + mid + " " + high);
        }
        System.out.println(low + " " + high);
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numbers = {-20, -4, 44, 58, 87, 99, 145};
        int val = 87;
        int index = search(87, numbers);  // 4
        if (index != -1) {
            System.out.println("We found "+val+" at location "+index); 
        }
        else {
            System.out.println("We didn't find " + val); 
        }
        
        index = search(-1, numbers); // -1
        System.out.println("Search 30: " + index);
    }
}