import java.util.*;

class FirstOccurrence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main string:");
        String str = sc.nextLine();

        System.out.println("Enter substring:");
        String sub = sc.nextLine();

        int i = 0;

        while(i < str.length())
        {
            int k = i;
            int j = 0;

            while(j < sub.length() && k < str.length())
            {
                if(str.charAt(k) != sub.charAt(j))
                {
                    break;
                }
                k++;
                j++;
            }

            if(j == sub.length())
            {
                System.out.println("First occurrence at index: " + i);
                return;
            }
            i++;
        }

        System.out.println("Substring not found");
    }
}
