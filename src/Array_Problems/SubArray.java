package Array_Problems;

import java.util.HashMap;

public class SubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n  = nums.length , sum=0,k=3,res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums)
        {
            sum+=num;
            if(map.containsKey(sum-k))
            {
               res+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(res);




    }
}
