package Week_2.com;


public class ReverseNum {
    public  static  void  main(String[] args)
    {
        int n = 12345;  // output: 54321
        int res  = 0;
        while(n>0)
        {
            int last = n % 10;
            res+=last;
            res*=10;
            n/=10;
        }

    }
}
