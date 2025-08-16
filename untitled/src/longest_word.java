import java.util.Scanner;
public class longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] result = s.split(" ");
        String largest = " ";
        for(String word:result ){
            if (word.length() > largest.length()){
                largest = word;
            }
        }
        System.out.println(largest);

    }
}
