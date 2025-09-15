package Week_2.com;

public class CountNumber {
   public static  void main(String[] args)
   {
       int pCnt = 0,nCnt =0,zeroCnt =0;
       int arr[] = {5, -3, 0, 12, -9, 0, 7};
       for(int num :arr)
       {
           if(num ==0)zeroCnt++;
           else if(num >0)pCnt++;
           else nCnt++;
       }
       System.out.println(pCnt);
       System.out.println(nCnt);
       System.out.println(zeroCnt);
   }
}
