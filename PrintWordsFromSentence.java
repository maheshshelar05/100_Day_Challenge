import java.util.*;

class PrintWordsFromSentence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = sc.nextLine();

        str = str.trim();
        str = str + " ";  

        int i = 0;
        char arr[] = new char[str.length()];
        int index = 0;
        int start = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch == ' ')
            {
                index = 0;

                for(int k = start; k < i; k++)
                {
                    arr[index] = str.charAt(k);
                    index++;
                }

                for(int j = 0; j < index; j++)
                {
                    System.out.print(arr[j]);
                }

                System.out.println();
                start = i + 1;
            }
            i++;
        }
    }
}
