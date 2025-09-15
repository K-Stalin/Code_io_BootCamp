package Week_2.com;

public class ElementEvenIndex {
    public  static  void  main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50, 60};
        // should print 10, 30, 50
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if((i&1)!=1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
