package Array_Problems;

public class MaxSubsum {
    public  static  void  main(String[] args)
    {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; // → 6 (subarray [4,-1,2,1])
        int maxSum =0;
        int res =0;

        for(int num:arr)
        {
            res+=num;
            if(res <0) res=0;
            maxSum = Math.max(maxSum,res);
        }
        System.out.println(maxSum);
    }
}
