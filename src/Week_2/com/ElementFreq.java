package Week_2.com;

public class ElementFreq {
    public static  void  main(String[] args)
    {
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        // Example: 2 appears 3 times, 6 appears 2 times
        int twoFreq =0,sixFreq =0;
        for(int num:arr)
        {
            twoFreq =  num ==2 ? twoFreq+1 : twoFreq;
            sixFreq =  num ==6 ? sixFreq+1 : sixFreq;
        }
        System.out.println(twoFreq);
        System.out.println(sixFreq);
    }
}
