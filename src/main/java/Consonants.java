import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consonants {
    private static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        String res = jisuan(sentence);
        System.out.println("The number of consonants is : "+cnt);
        System.out.println("The replaced string is : ");
        System.out.println(res);
    }
    public static String jisuan(String s){
        List<Character> cons = new ArrayList<>();
        cons.add('b');cons.add('m');cons.add('c');cons.add('d');cons.add('f');cons.add('g');cons.add('h');cons.add('j');cons.add('k');cons.add('l');
        cons.add('n');cons.add('p');cons.add('q');cons.add('r');cons.add('s');cons.add('t');cons.add('v');cons.add('w');cons.add('x');cons.add('y');
        cons.add('z');cons.add('B');cons.add('C');cons.add('D');cons.add('F');cons.add('G');cons.add('H');cons.add('J');cons.add('K');cons.add('L');
        cons.add('M');cons.add('N');cons.add('P');cons.add('Q');cons.add('R');cons.add('S');cons.add('T');cons.add('V');cons.add('W');cons.add('X');
        cons.add('Y');cons.add('Z');
        StringBuilder res = new StringBuilder();
        int len = s.length();
        if (len!=0) {
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (cons.contains(c)){
                    res.append("*");
                    cnt += 1;
                }
                else res.append(c);
            }
        }
        return res.toString();
    }
}
