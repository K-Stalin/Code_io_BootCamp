package Array_Problems;

import java.util.HashMap;

public class MissingNum {
    public static void main(String[] args)
    {
        int[] nums = {1,2,4,5};
        HashMap <Integer,Integer>  map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int num:nums)
        {
            max= Math.max(max,num);
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=1;i<=max;i++)
        {
            if(!map.containsKey(i))
            {
                System.out.println(i);
                break;
            }
        }

    }
}
