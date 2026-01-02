import java.util.*;

class NaivePatternMatching
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        System.out.println("Enter the pattern:");
        String pattern = sc.nextLine();

        int textLength = text.length();
        int patternLength = pattern.length();

        int count = 0;

        if(patternLength > textLength)
        {
            System.out.println("Pattern is longer than text");
            return;
        }

        for(int i = 0; i <= textLength - patternLength; i++)
        {
            int j;

            for(j = 0; j < patternLength; j++)
            {
                if(text.charAt(i + j) != pattern.charAt(j))
                {
                    break;
                }
            }

            if(j == patternLength)
            {
                System.out.println("Pattern found at index: " + i);
                count++;
            }
        }

        System.out.println("Total occurrences: " + count);
    }
}
