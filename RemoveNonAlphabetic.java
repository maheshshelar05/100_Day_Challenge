import java.util.*;

class RemoveNonAlphabetic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";
        int i = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                result = result + ch;
            }
            i++;
        }

        System.out.println("After removing non-alphabetic characters:");
        System.out.println(result);
    }
}
