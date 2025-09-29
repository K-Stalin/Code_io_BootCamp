package Matrix_Problems;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
         int[][] arr = {
                 {1,2,3},
                 {4,5,6},
                 {7,8,9},
                   };
         int n= arr.length;
//          7 4 1
//          8 5 2
//          9 6 3
           for(int i=0;i<n;i++)
           {
               for(int j = 0; j <= i; j++)
               {
                   swap(arr,i,j);
               }
           }
        for (int[] ints : arr) {
            reverse(ints);
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
    static  void  swap(int[][] arr,int i,int j)
    {
        int temp = arr[i][j];
         arr[i][j] = arr[j][i];
         arr[j][i] = temp;
    }
    static  void  reverse(int[] arr)
    {
        int i=0,j=arr.length-1;
        while (i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
}
