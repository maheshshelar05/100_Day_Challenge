
import java.util.*;

class RemoveDupliChar {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int found = 0;

            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
