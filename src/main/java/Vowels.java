import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        int cnt = 0;
        List<Character> v = new ArrayList<>();
        v.add('a');v.add('e');v.add('u');v.add('i');v.add('o');v.add('A');v.add('E');v.add('U');v.add('I');v.add('O');
        int len = sentence.length();
        if (len != 0){
            for (int i = 0; i < len;i++){
                if (v.contains(sentence.charAt(i))){
                    cnt++;
                }
            }
        }
        System.out.println("The number of vowels is"+" "+cnt);
    }
}
