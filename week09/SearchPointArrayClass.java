// Adam Poliak
// 11/03/2022
// Starter code for linear search

public class SearchPointArrayClass {

    Point[] points;

    public SearchPointArrayClass(Point[] points) {
        this.points = points;

    }


    /** Determine if the list contains an objects 
        @param obj the object to find
        @return true if the object is in the list, false otherwise
    */
    public boolean contains(Object obj) {
        
	// Pseudocode:
        // Iterate through each Point in the array:
            // if the currentPoint is the point we are looking for return
                // return true
        for (int i = 0; i < points.length; i++) {
            Point currentPoint = points[i];
            if (currentPoint.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /** Find the index of a Point p
        @param obj the object to find
        @return the index of the object, -1 if it isnt in the list
    */
    public int indexOf(Object obj) {
        //TODO: Imeplement this method
        return -1;
    }

    /** Find the number of times an Object obj is in a list of Objects
        @param obj the object to count
        @return the number of times the object appears
    */
    public int count(Object obj) {
        //TODO: Imeplement this method
        return 0;
    }

    /**
     * Finds the largest distance between the origin and
     * the list of points
     * 
     * @return the largest distance
     */
    public static int furtherDistanceFromOrig() {
        // TODO: implement 
        return 0;
    } 

    public static void main(String[] args) {
        Point origin = new Point(0, 0);

        Point[] pointList = {new Point(1, 1), new Point(3, 2),
                             new Point(10, 9), new Point(-1, -1),
                             new Point(-3, 5),
                            new Point(0, 0),
                            new Point(3, 2)};

        SearchPointArrayClass list = new SearchPointArrayClass(pointList);


        System.out.println(list.contains(origin));
        System.out.println(list.contains(new Point(100, 1)));

        System.out.println(list.indexOf(new Point(1, 1)));
        System.out.println(list.indexOf(new Point(-3, 5)));
        System.out.println(list.indexOf(new Point(100, 1)));

        System.out.println(list.count(new Point(3, 2)));
        System.out.println(list.count(new Point(100, 2)));

        System.out.println(list.furtherDistanceFromOrig());



    }
}
