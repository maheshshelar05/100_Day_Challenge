import java.util.*;

class StringRotation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if(s1.length() == s2.length())
        {
            String temp = s1 + s1;

            if(temp.contains(s2))
                System.out.println("Strings are rotations of each other");
            else
                System.out.println("Strings are NOT rotations of each other");
        }
        else
        {
            System.out.println("Strings are NOT rotations of each other");
        }
    }
}
