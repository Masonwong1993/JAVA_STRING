//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LastLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        sentence = sentence.trim();
        Set<Character> special = new HashSet<>();
        special.add('#');special.add('$');special.add('&');special.add('*');
        special.add('?');special.add('!');special.add('@');special.add('%');
        special.add('^');special.add('(');special.add(')');special.add('[');
        special.add(']');special.add('{');special.add('}');special.add(',');
        special.add('.');special.add('\\');special.add('|');special.add('`');
        special.add('~');special.add('<');special.add('>');special.add('/');
        special.add('=');special.add('+');
        StringBuilder newsentence = new StringBuilder();
//        StringBuilder mask = new StringBuilder();
        for (int i = sentence.length()-1; i >= 0 ; i--) {
            if (special.contains(sentence.charAt(i))){
                newsentence.append(" ");
//                mask.append(sentence.charAt(i));
            }
            else {
                newsentence.append(sentence.charAt(i));
//                mask.append(" ");
            }
        }
        int cnts = 0;
        int cnty = 0;
        int sindex = 0;
        int yindex = 0;
        int index = 0;
        String[] words = newsentence.toString().split(" ", 0);
        if (words.length!=0) {
            for (String word : words) {
                //System.out.println(word);
                if (!word.equals("")&&!word.equals(" ")) {
                    char c = word.charAt(0);
                    if ( c == 'y' || c == 'Y') {
                        cnty += 1;
                        yindex = index;
                    } else if (c == 's' || c == 'S') {
                        cnts += 1;
                        sindex = index;
                    }
                    index += 1;
                }
            }
            String temp = words[sindex];
            words[sindex] = words[yindex];
            words[yindex] = temp;
        }
        //System.out.println(words[sindex]);
        //System.out.println(words[yindex]);
        //System.out.println(words[0]);System.out.println(words[1]);System.out.println(words[2]);
        //System.out.println(words[3]);System.out.println(words[4]);System.out.println(words[5]);
        System.out.println("The number of words ending with 'y' or 'Y' is :"+cnty);
        System.out.println("The number of words ending with 's' or 'S' is :"+cnts);


        StringBuilder res = new StringBuilder();
        //String[] punctuation = mask.toString().split(" ", 0);
//        ArrayList<String> p = new ArrayList<>();
//        for (String punc : punctuation){
//            if (!punc.equals("")) p.add(punc);
//        }
        if (words.length!=0){
            for (String word : words){
                if (!word.equals("")){
                    res.append(" ");
                    res.append(word);

                }
            }
            res = res.reverse();
            char first = Character.toUpperCase(res.charAt(0));
            res.replace(0,1,String.valueOf(first));
        }


        System.out.println("Reorganized sentence :");
        System.out.println(res.toString());


    }
}
