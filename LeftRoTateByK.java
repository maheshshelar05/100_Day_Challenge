import java.util.*;
class LeftRotateByK
{
    public static void main(String args[])
    {
        int arr[]={5,6,3,4,1};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K value ");
        int k=sc.nextInt();

        System.out.println("____\n");
        for(int i=0;i<k;i++)
        {
            int temp=arr[0];

            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=arr[3];
            arr[3]=arr[4];
            arr[4]=temp;
        }

        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }

}