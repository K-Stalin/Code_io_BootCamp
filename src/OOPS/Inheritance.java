package OOPS;

public class Inheritance {
     void printName(){
        System.out.println("GOMS");
    }
}


class   Child extends  Inheritance{
    void print()
    {
        System.out.println("Call of Duty");
    }
}

class  Test{
    public static void main(String[] args) {
        Child child = new Child();
        child.printName();
    }
}
