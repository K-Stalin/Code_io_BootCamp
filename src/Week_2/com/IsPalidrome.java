package Week_2.com;

public class IsPalidrome {
    public static  void main(String[] args)
    {
//        int n    = 1221;
//        if(n < 0) System.out.println("Not palindrome");
//        int temp = n;
//        int res  = 0;
//        while(n>0)
//        {
//            int last = n % 10;
//            res+=last;
//            res*=10;
//            n/=10;
//        }
//        res/=10;
//        String ans = res == temp ? "Palindrome" : "Not a Plaindrome";
//        System.out.println(ans);
      int n=5;
      int space = n/2;
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=5;j++)
          {

              if(j<=space && i<=space)
              {
                  System.out.print(space);
              }else
              {
                  System.out.print("*");
              }
          }

          space--;

          System.out.println();
      }
//          *
//         ***
//        *****
//         ***
//          *
    }
}
