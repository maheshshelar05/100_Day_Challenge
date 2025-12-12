import java.util.*;

class CountWords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = sc.nextLine();

        str = str.trim(); 

        int i = 0;
        int count = 0;

        char prev = 'a';  

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch == ' ' && prev != ' ')
            {
                count = count + 1;
            }

            prev = ch;
            i++;
        }

        int words = count + 1;

        System.out.println("Total words = " + words);
    }
}
