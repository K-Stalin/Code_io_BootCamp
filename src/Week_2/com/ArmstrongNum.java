package Week_2.com;

public class ArmstrongNum {
  public  static  void  main(String[] args)
  {
      int n    = 153;  // 1³ + 5³ + 3³ = 153 → Armstrong
      int temp = n;
      int numLen = numLength(n);
      int res = 0;
      while(n>0)
      {
          int last = n%10;
          res+=powerofNum(last,numLen);
          n/=10;
      }
      String ans = res == temp ? "Armstrong" : "Not a Armstrong";
      System.out.println(ans);

  }
  public  static  int powerofNum(int num,int pow)
  {
      int res = 1;
      for(int i=1;i<=pow;i++)
      {
          res*=num;
      }
      return res;
  }
  public  static  int numLength(int n)
  {
      int nCnt =0;
      while (n>0)
      {
          nCnt++;
          n/=10;
      }
      return  nCnt;
  }
}
