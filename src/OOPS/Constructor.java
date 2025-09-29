package OOPS;

public class Constructor {
    int a;
}

class   Parameterized{
    String name;
    Parameterized(String name)
    {
        this.name= name;
    }
}

class  ZeroArgument{
    String name;
    ZeroArgument()
    {
        this.name = "GOMS";
    }
}

class  CMain{
    public static void main(String[] args) {
        // Default Constructor
        Constructor constructor = new Constructor();
        System.out.println(constructor.a);

        // parameterized Constructor
        Parameterized parameterized = new Parameterized("GOMS");
        System.out.println(parameterized.name);

        // zeroArgument
        ZeroArgument zeroArgument = new ZeroArgument();
        System.out.println(zeroArgument.name);
    }
}
