import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();

        StringBuilder rev = new StringBuilder();
        int len = sentence.length();
        if (len !=0) {
            for (int i = 0; i < len; i++) {
                char c = sentence.charAt(i);
                if (Character.isLetter(c))rev.append(Character.toLowerCase(c));
            }
        }
        String s = rev.toString();
        String s1 = rev.reverse().toString();
        boolean ans = true;
        if (!s.equals(s1)) ans = false;
        if (ans) System.out.println("The sentence is palindrome");
        else System.out.println("The sentence is not palindrome");
    }
}
