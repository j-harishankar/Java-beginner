import java.util.Scanner;
import java.util.HashMap;
public class firstNonRepeatingChar {
    public static void main(String[] args){
        HashMap<Character,Integer> freq = new HashMap<>();
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++){
            if (freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            }
            else{
                freq.put(s.charAt(i),1);
            }
            }
        for(int j = 0;j<s.length();j++){
            if(freq.get(s.charAt(j))==1){
                System.out.println(s.charAt(j));
            }
        }
    }
}



