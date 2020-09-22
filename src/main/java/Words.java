
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        int num = jisuan(sentence);

        System.out.println("There are "+num+" words in this sentence");

    }
    public static int jisuan(String s){
        s = s.trim();
        Set<Character> special = new HashSet<>();
        special.add('#');special.add('$');special.add('&');special.add('*');special.add('?');special.add('!');
        special.add('@');special.add('%');special.add('^');special.add('(');special.add(')');special.add('[');
        special.add(']');special.add('{');special.add('}');special.add(',');special.add('.');special.add('\\');
        special.add('|');special.add('`');special.add('~');special.add('<');special.add('>');special.add('/');
        special.add('=');special.add('+');
        StringBuilder newsentence = new StringBuilder();
        for (int i = 0 ; i < s.length();i++){
            if (special.contains(s.charAt(i))) newsentence.append(" ");
            else newsentence.append(s.charAt(i));
        }

        String[] sentences = newsentence.toString().split(" ",0);
        System.out.println(sentences.length);
        int num = 0;
        for (String sen : sentences){
            if (!sen.equals("")) num += 1;

        }
        return num;
    }

}
