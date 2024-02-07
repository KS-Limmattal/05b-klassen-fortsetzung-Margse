import java.awt.Point;

public class PointTester {
    static Point a= new Point(2,5);
    public static void main(String[] args) {
        System.out.println(a.toString());
        a.setLocation(a.getY(), a.getX());
        System.out.println(a.toString());
        Point b=new Point(a);
        System.out.println(b.equals(a));
        System.out.println(a==b?true:false);
        System.out.println(b);
    }
}
