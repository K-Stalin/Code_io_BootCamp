package OOPS;

public class PolyMorphism {
    void typeOf(int a)
    {
        System.out.println("Integer");
    }
//    void typeOf(char ch)
//    {
//        System.out.println("char");
//    }
//    void typeOf(String s)
//    {
//        System.out.println("String");
//    }
//    void typeOf(double a)
//    {
//        System.out.println("Double");
//    }
}

class   ChildP extends   PolyMorphism{
//    void typeOf(String a)
//    {
//        System.out.println(a);
//    }
}


class   Demo{
    public static void main(String[] args) {
        ChildP childP = new ChildP();
        childP.typeOf(3);
    }
}
