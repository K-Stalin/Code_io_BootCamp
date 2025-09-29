package OOPS;

public class Remote {
    int a;
    void turning_on()
    {
        System.out.println("Turning ON");
    }
    static  int b;
}


 class Main{
    public static void main(String[] args) {

        // NON-Static
        Remote remote = new Remote();
        remote.a =10;
        System.out.println(remote.a);

        //  Static
        Remote.b =100;
        System.out.println(Remote.b);
    }
}
