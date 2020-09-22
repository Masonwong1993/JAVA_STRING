import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        boolean a = ans(sentence);
        if (a) System.out.println("The sentence is palindrome");
        else System.out.println("The sentence is not palindrome");
    }
    public static boolean ans(String s){
        StringBuilder rev = new StringBuilder();
        int len = s.length();
        if (len !=0) {
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)||Character.isDigit(c))rev.append(Character.toLowerCase(c));
            }
        }
        String s0 = rev.toString();
        String s1 = rev.reverse().toString();
        boolean ans = true;
        if (!s0.equals(s1)) ans = false;
        return ans;
    }
}
