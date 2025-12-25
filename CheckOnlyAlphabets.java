import java.util.*;

class CheckOnlyAlphabets
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int i = 0;
        int flag = 1;

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
               
            }
            else
            {
                flag = 0;
                break;
            }
            i++;
        }

        if(flag == 1)
            System.out.println("String contains only alphabets");
        else
            System.out.println("String contains non-alphabet characters");
    }
}
