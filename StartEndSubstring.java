import java.util.*;

class StartEndSubstring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter main string:");
        String str = sc.nextLine();

        System.out.println("Enter substring:");
        String sub = sc.nextLine();

        if(str.startsWith(sub) && str.endsWith(sub))
        {
            System.out.println("String starts and ends with the given substring");
        }
        else
        {
            System.out.println("String does NOT start and end with the given substring");
        }
    }
}
