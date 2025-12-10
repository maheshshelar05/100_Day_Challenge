import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Elements :");

        int arr[]=new int[10];
        int i=0;
         while(i<arr.length)
         {
            arr[i]=sc.nextInt();
            i++;
         }

         for(int pass=0; pass < arr.length-1; pass++)
         {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
         }



        System.out.println("____After Sort____");

         for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
    }

}