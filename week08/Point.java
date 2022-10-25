// Adam Poliak
// 10/20/2022
// Defining a Point class and then making Point objects

class Point {

    // instance variables (data)
    // What values do every point have?
    double x;
    double y;
    String color; 
    String name;

  
    public Point() { // implemention of a constructor
      // purpose: create an empty point
      System.out.println("here!");
      // What should the default x and y points be?
      this.x = 0;
      this.y = 0;

    }
  
    public Point(double x, double y) { // implemention of a constructor
      // let's assign the values (note for Adam, use "this")
      //System.out.println("Constructor with x and y");
      this.x = x;
      this.y = y;
    }

    // this constructor and the one above are the same
    // public Point(double newX, double newY) { // implemention of a constructor
    //     // let's assign the values (note for Adam, use "this")
    //     System.out.println("Constructor with x and y");
    //     x = newX;
    //     y = newY;
    //   }

    public Point(double x, double y, String color, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;
        System.out.println("Constrcutr with all instance vriables set");
    }

    // Implement our accessors (get functions)
    // instance vriables
    // x

    // Get the x coordiante
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    /*
     * Assign (or update) the object's x instance variable
     * 
     * @argument: double - the new value of the object's x
     */
    public void setX(double newX) {
        x = newX;
    }

    /*
     * Assign (or update) the object's y instance variable
     * 
     * @argument: double - the new value of the object's y
     */
    public void setY(double newY) {
        y = newY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
      this.color = color;
    }

    /*
     * Find the distance between this point and another point called p
     */
    public double distance(Point p) {
        // we have an implict argument being passed in
        // the impicit arguemnt is the object tht we are currently in
        // we access that object by using "this"
       double x2 = p.getX();
       double y2 = p.getY();
       //p2.getX();
       double x1 = this.x;  // p2.getX();
       double y1 = this.y;
       return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    public String toString() {
        return "Point " + name + "'s color is " + color + ", x: " + x + ", and y: " + y;
    }
  
    public static void main(String[] args) {
      //Point p; // constructor not called
      Point p = new Point(); // Empty constructor called
      Point p2 = new Point(3, 5); // Constructor with 2 arguments called
      Point p3 = new Point(7, 11, "pink", "point3");

      System.out.printf("The point %s's x and y coordinates are %.2f and %.2f", 
                                 p3.getName(), p3.getX(), p3.getY());

        System.out.printf("The point %s's x and y coordinates are %.2f and %.2f", 
                                    p.getName(), p.getX(), p.getY());
        System.out.println();
        System.out.println(p2.distance(p3));

        System.out.println(Point.distance(p2, p3));
    }


    //System.out.print(p3);
  }
