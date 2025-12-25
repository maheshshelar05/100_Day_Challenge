import java.util.*;

class CountWordOccurrence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        System.out.println("Enter word to search:");
        String sub = sc.nextLine();

        int i = 0;
        int count = 0;

        while(i <= str.length() - sub.length())
        {
            int j = 0;

            while(j < sub.length())
            {
                if(str.charAt(i + j) != sub.charAt(j))
                {
                    break;
                }
                j++;
            }

            if(j == sub.length())
            {
                count++;
                i = i + sub.length();   // move ahead after match
            }
            else
            {
                i++;
            }
        }

        System.out.println("Word occurred " + count + " times");
    }
}
