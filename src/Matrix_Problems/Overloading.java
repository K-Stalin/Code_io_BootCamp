package Matrix_Problems;

public class Overloading {

    static  void typeOf(int n)
    {
        System.out.println("Integer");

    }

    static  void typeOf(double n)
    {
            System.out.println("Float");
    }

    static  void typeOf(String s)
    {
            System.out.println("String");
    }

    static  void typeOf(int[] arr)
    {
            System.out.println("Array");
    }


    public static void main(String[] args) {

        typeOf(1);
        typeOf(1.1);
        typeOf("Stalin");
        int[] arr= {1,2,3};
        typeOf(arr);
    }
}
