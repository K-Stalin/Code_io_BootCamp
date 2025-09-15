package Week_2.com;

public class Pyramid {
    public  static  void  main(String[] args)
    {
        //    For n = 5, print the following pattern:
        //    *
        //   ***
        //  *****
        // *******
        //*********
        int n=5;
        int starEnd =1;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=starEnd;star++)
            {
                System.out.print("*");
            }
            System.out.println();
            starEnd+=2;
        }

    }
}
