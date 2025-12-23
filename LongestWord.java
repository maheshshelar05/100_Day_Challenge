import java.util.*;

class LongestWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        int i = 0;
        String longest = words[0];

        while(i < words.length)
        {
            if(words[i].length() > longest.length())
            {
                longest = words[i];
            }
            i++;
        }

        System.out.println("Longest word is: " + longest);
        System.out.println("Length is: " + longest.length());
    }
}
