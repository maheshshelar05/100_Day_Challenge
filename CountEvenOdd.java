import java.util.*;
class CountEvenOdd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();

        int  evenCounter=0;
        int oddCounter=0;

        int rem=0;
        int temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            
            if(rem % 2==0)
            
                evenCounter++;
            
            else
            
                oddCounter++;
            

            temp=temp/10;
        }

        System.out.println("Even Numbers : "+evenCounter);
        System.out.println("Odd Numbers : "+oddCounter);
    }
}
