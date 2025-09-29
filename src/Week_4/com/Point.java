package Week_4.com;

public class Point {
    int x,y;

    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    Point(Point other)
    {
        this.x = other.x;
        this.y = other.y;
    }

}

class  PointMain{
    public static void main(String[] args) {
        Point point = new Point(4,5);
        Point point1 = new Point(point);

        point.x = 11;
        System.out.println(point.x);
        System.out.println(point1.x);
    }
}
