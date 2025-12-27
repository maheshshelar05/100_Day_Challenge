import java.util.*;

class StringToInt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numeric string:");
        String str = sc.nextLine();

        int i = 0;
        int result = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

      
            int digit = ch - '0';

   
            result = result * 10 + digit;

            i++;
        }

        System.out.println("Converted integer: " + result);
    }
}
