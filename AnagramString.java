import java.util.*;

class AnagramString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();


        if(s1.length() != s2.length())
        {
            System.out.println("Not an Anagram");
            return;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        int i = 0;
        while(i < arr1.length)
        {
            int j = 0;
            int found = 0;

            while(j < arr2.length)
            {
                if(arr1[i] == arr2[j])
                {
                    arr2[j] = '#';   
                    found = 1;
                    break;
                }
                j++;
            }

            if(found == 0)
            {
                System.out.println("Not an Anagram");
                return;
            }

            i++;
        }

        System.out.println("Strings are Anagram");
    }
}
