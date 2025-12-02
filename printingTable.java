import java.util.*;
class printingTable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int num=sc.nextInt();

        int i=0;
        int table=0;
        while(i<=10)
        {
            table=num*i;

        System.out.println(table);
            i++;
        }

    }
}
