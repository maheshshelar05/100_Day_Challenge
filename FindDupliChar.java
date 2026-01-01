import java.util.*;
class FindDupliChar
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int found = 0;

            for (int j = i+1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    found = 1;
                    break;
                }

            }
                if(found==1)
                System.out.println("Duplicate Char : "+ ch);
        }
    }
}