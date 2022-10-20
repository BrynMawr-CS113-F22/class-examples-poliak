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
      System.out.println("Constructor with x and y");
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
  
    public static void main(String[] args) {
      //Point p; // constructor not called
      Point p = new Point(); // Empty constructor called
      Point p2 = new Point(3, 5); // Constructor with 2 arguments called
      Point p3 = new Point(7, 11, "pink", "point3");

      System.out.printf("The point %s's x and y coordinates are %.2f and %.2f", 
                                 p3.getName(), p3.getX(), p3.getY());

    System.out.printf("The point %s's x and y coordinates are %.2f and %.2f", 
                                 p.getName(), p.getX(), p.getY());
    }
    //System.out.print(p3);
  }