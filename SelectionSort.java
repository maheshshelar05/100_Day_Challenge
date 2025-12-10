import java.util.*;
class SelectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Elements :");

        int arr[]=new int[5];
        int i=0;
         while(i<arr.length)
         {
            arr[i]=sc.nextInt();
            i++;
         }

         for(int j=0; j < arr.length-1; j++)
        {
            for(int k=j+1; k < arr.length; k++)
            {
                if(arr[j] > arr[k])
                {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
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