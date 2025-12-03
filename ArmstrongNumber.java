import java.util.*;
class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();

        int rem=0;
        int cube=0;

        int temp=num;
        while(temp>0)
        {
            rem=temp%10;
            cube=cube+(rem*rem*rem);
            temp=temp/10;
        }

        if(cube==num)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }

    }
}