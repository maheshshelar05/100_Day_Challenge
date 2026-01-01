import java.util.*;

class LargestPalindromeWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        String largestPalindrome = "";

        int i = 0;
        while(i < words.length)
        {
            String word = words[i];

            StringBuilder sb = new StringBuilder(word);
            sb.reverse();

            if(word.equals(sb.toString()))
            {
                if(word.length() > largestPalindrome.length())
                {
                    largestPalindrome = word;
                }
            }
            i++;
        }

        if(largestPalindrome.length() > 0)
            System.out.println("Largest palindrome word: " + largestPalindrome);
        else
            System.out.println("No palindrome word found");
    }
}
