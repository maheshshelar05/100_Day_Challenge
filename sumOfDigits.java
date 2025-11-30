import java.util.*;
class sumOfDigit 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();

        int sum=0;
        while(num!=0)
        {
            int rem = num % 10;
            sum = sum  + rem;
            num = num / 10;
        }
        System.out.println("Reversed Number is : " + sum);
    }
}