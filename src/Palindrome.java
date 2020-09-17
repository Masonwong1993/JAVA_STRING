import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        int len = sentence.length();
        if (len !=0) {
            for (int i = len - 1; i >= 0; i--) {
                rev.append(sentence.charAt(i));
            }
        }
        String s = rev.toString();
        boolean ans = true;
        if (!sentence.equals(s)) ans = false;
        if (ans) System.out.println("The sentence is palindrome");
        else System.out.println("The sentence is not palindrome");
    }
}
