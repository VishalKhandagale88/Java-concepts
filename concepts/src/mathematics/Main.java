package mathematics;

import mathematics.triangles.Point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        Point p2 = new Point(6,7);
        double distance1 = p1.distance(p2);
        double distance2 = p2.distance(p1);
        System.out.println("Distance2 : "+distance2);
        System.out.println("Distance1 : "+distance1);
    }
}
