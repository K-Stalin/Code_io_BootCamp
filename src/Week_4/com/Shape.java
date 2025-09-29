package Week_4.com;

import Week_3.com.Rectangle;

public class Shape {

    void area()
    {
        System.out.println("creating Derive Class to  Override");
    }
}

class Rectangles extends  Shape{
    int l,w;
    Rectangles(int l,int w)
    {
        this.l = l;
        this.w= w;
    }
    @Override
    void area()
    {
        System.out.println("Area of Rectangle: "+ l*w);
    }
}

class Circle extends  Shape{
    int r;
    Circle(int r)
    {
        this.r=r;
    }
    @Override
    void area()
    {
        System.out.println("Area of Circle: "+ 3.14*(r*r));
    }
}
class Triangle extends  Shape{

    int b,h;
    Triangle(int b,int h)
    {
        this.b= b;
        this.h=h;
    }

    @Override
    void area()
    {
        System.out.println("Area of Triangle: "+ (0.5)*(b*h));
    }
}

class  Main{
    public static void main(String[] args) {
         Shape[] shape = new Shape[3];
         shape[0] =  new Rectangles(2,4);
         shape[1] =  new Triangle(3,5);
         shape[2] =  new Circle(4);

         for(Shape sh:shape)
         {
             sh.area();
         }

    }
}