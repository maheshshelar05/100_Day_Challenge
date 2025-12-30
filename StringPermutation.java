import java.util.*;

class StringPermutation
{
    public static void permute(String str, String result)
    {
        if(str.length() == 0)
        {
            System.out.println(result);
            return;
        }

        int i = 0;
        while(i < str.length())
        {
            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            permute(left + right, result + ch);
            i++;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("_____");
        permute(str, "");
    }
}
