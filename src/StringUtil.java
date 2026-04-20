import java.util.Scanner;

public class StringUtil {
    public static void reverseLetters() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] rev = new char[str.length()];
        for (int start = 0, stop = str.length() - 1; start < str.length() && stop >= 0; start++, stop--) {
            if (Character.isLetter(str.charAt(start))) {
                rev[stop] = str.charAt(start);
            } else {
                rev[start] = str.charAt(start);
            }
        }
        System.out.println(new String(rev));
    }
}
