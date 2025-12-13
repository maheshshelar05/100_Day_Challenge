import java.util.*;

class ReverseEachWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence :");
        String str = sc.nextLine();

        str = str.trim();
        str = str + " ";  

        int i = 0;
        int start = 0;

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch == ' ')
            {
                int j = i - 1;

                while(j >= start)
                {
                    System.out.print(str.charAt(j));
                    j--;
                }

                System.out.print(" ");
                start = i + 1;
            }
            i++;
        }
    }
}
