import java.util.*;
class CountVowelsAndConstants
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        int vowels=0;
        int constant=0;
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' 
                || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            
                vowels++;
            
            else
            
                constant++;
            

        }
         System.out.println("Number of vowels : "+vowels);
         System.out.println("Number of Constants : "+constant);
    }
}