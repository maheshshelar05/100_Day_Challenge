import java.util.*;

class SortString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str =sc.nextLine();

        char ch[] = str.toCharArray();

        int i = 0;
        while(i < ch.length)
        {
            int j = i + 1;
            while(j < ch.length)
            {
                if(ch[i] > ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.print("Sorted String: ");
        i = 0;
        while(i < ch.length)
        {
            System.out.print(ch[i]);
            i++;
        }
    }
}
