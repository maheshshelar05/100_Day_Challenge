import java.util.*;

class SecondMostFrequentChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int freq[] = new int[256]; 

        int i = 0;
        while(i < str.length())
        {
            char ch = str.charAt(i);
            freq[ch]++;
            i++;
        }

        int firstMax = 0;
        int secondMax = 0;
        char firstChar = '\0';
        char secondChar = '\0';

        i = 0;
        while(i < 256)
        {
            if(freq[i] > firstMax)
            {
                secondMax = firstMax;
                secondChar = firstChar;

                firstMax = freq[i];
                firstChar = (char)i;
            }
            else if(freq[i] > secondMax && freq[i] != firstMax)
            {
                secondMax = freq[i];
                secondChar = (char)i;
            }
            i++;
        }

        if(secondMax > 0)
            System.out.println("Second most frequent character: " + secondChar);
        else
            System.out.println("Second most frequent character not found");
    }
}
