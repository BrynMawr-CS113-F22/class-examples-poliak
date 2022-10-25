public class PointArray {

    // program to asks a user for a number of points, 
    // for each point, ask the user for x and y coordinates,
    //and then store them in an array

    public static void main(String[] args) {
        // ask user for the number
        System.out.println("How many points would you like?");
        int numPoints = Integer.parseInt(System.console().readLine());

        Point[] points = new Point[numPoints];
        // for every point, ask user for x and y coordinates and add it to the array
        for (int i = 0; i < numPoints; i++) {
            System.out.printf("Give me an x coor for point %d \n", i+1);
            double x = Double.parseDouble(System.console().readLine());
            System.out.printf("Give me an t coor for point %d \n", i+1);
            double y = Double.parseDouble(System.console().readLine());

            Point p = new Point(x, y);
            points[i] = p;
        }

        for (int i = 0; i < numPoints; i++) {
            System.out.println(points[i].toString());
        }

    }
}