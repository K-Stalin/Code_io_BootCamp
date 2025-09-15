package Week_2.com;

public class IsPalidrome {
    public static  void main(String[] args)
    {
        int n    = 1221;
        int temp = n;
        int res  = 0;
        while(n>0)
        {
            int last = n % 10;
            res+=last;
            res*=10;
            n/=10;
        }
        res/=10;
        String ans = res == temp ? "Palindrome" : "Not a Plaindrome";
        System.out.println(ans);
    }
}
