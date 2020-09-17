import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String sentence = sc.nextLine();
        sentence = sentence.trim();
        sentence = sentence.replace(",", " ");
        String[] sentences = sentence.split(" ",0);
        System.out.println(sentences.length);
        int num = 0;
        for (String s : sentences){
            if (!s.equals("")) num += 1;

        }

        System.out.println("There are "+num+" words in this sentence");

    }

}
