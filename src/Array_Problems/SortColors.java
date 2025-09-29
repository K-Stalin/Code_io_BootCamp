package Array_Problems;

import java.util.Arrays;

public class SortColors {
    public static  void main(String[] args)
    {
        int[] arr = {2,0,2,1,1,0};

        int n = arr.length;
        int start=0,mid=0,end=n-1;
        while (mid<=end)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,start);
                start++;
                mid++;
            }
            else if(arr[mid]==2)
            {
              swap(arr,mid,end);
              end--;
              mid++;
            }else
            {
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
