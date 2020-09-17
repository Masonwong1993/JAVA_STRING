import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        sentence = sentence.trim();
        Set<Character> special = new HashSet<>();
        special.add('#');special.add('$');special.add('&');special.add('*');special.add('?');special.add('!');
        special.add('@');special.add('%');special.add('^');special.add('(');special.add(')');special.add('[');
        special.add(']');special.add('{');special.add('}');special.add(',');special.add('.');special.add('\\');
        special.add('|');special.add('`');special.add('~');special.add('<');special.add('>');special.add('/');
        special.add('=');special.add('+');
        StringBuilder newsentence = new StringBuilder();
        for (int i = 0 ; i < sentence.length();i++){
            if (special.contains(sentence.charAt(i))) newsentence.append(" ");
            else newsentence.append(sentence.charAt(i));
        }

        String[] sentences = newsentence.toString().split(" ",0);
        System.out.println(sentences.length);
        int num = 0;
        for (String s : sentences){
            if (!s.equals("")) num += 1;

        }

        System.out.println("There are "+num+" words in this sentence");

    }

}
