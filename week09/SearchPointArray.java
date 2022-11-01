public class SearchPointArray {

    // program to asks a user for a number of points, 
    // for each point, ask the user for x and y coordinates,
    //and then store them in an array

    public static boolean contains(Point[] list, Point p) {
        
        // Iterate through each Point in the array:
            // if the currentPoint is the point we are looking for return
                // return true
        for (int i = 0; i < list.length; i++) {
            Point currentPoint = list[i];
            if (currentPoint.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Point origin = new Point(0, 0);

        Point[] pointList = {new Point(1, 1), new Point(3, 2),
                             new Point(10, 9), new Point(-1, -1),
                             new Point(-3, 5),
                            new Point(0, 0)};


        System.out.println(contains(pointList, origin));
        // First print out the list/array of points
    }
}