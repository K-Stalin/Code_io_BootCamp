package Week_3.com;

public class Rectangle {

    int l;
    int b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void  calcArea()
    {
        System.out.println(2*(l+b));
    }
    void calcPerimeter()
    {
        System.out.println(l*b);
    }
}



