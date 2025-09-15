package Week_2.com;

public class SecondLarger {
    public  static  void  main(String[] args)
    {
        int arr[] = {14, 28, 19, 333, 45, 12};
        int firstMax  =-1;
        int secondMax =-1;
        if (arr.length ==1) System.out.println("In this Array have only one Max Nummber is :" +arr[0]);
        else {
            for (int num : arr) {
                if (firstMax < num) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (secondMax < num) {
                    secondMax = num;
                }
            }
            System.out.println(secondMax);
        }
    }
}
