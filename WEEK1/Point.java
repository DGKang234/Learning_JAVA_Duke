
public class Point{           // Declaration class called Point
    private int x;            // Declaration of two fields: x and y (instance variables)
    private int y;            // Private means that only code inside of this class can directly manipulate these fields.
    public Point(int startx, int starty) {  // Declaration of a constructor
        x = startx;                         // specifies how to create objects of this class. 
        y = starty;
    }
    public int getX() { return x; }         // Declaration of three methods
    public int getY() { return y; }
    public double distance(Point otherPt) {
        int dx = x - otherPt.getX();    // calls the get X method on the other point object. It will get the X of that particular point object.
        int dy = y - otherPt.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main (String[] args) {   // Declaration of a static method, main
        Point p1 = new Point(3,4);      // They don't act on any particular instance of a class, they just belong to the class in general.
        Point p2 = new Point(6,8);      // Execution begins in main before any objects are even created.
        System.out.println(p1.distance(p2));
    }
}
