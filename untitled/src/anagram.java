import java.util.Scanner;
import java.util.HashMap;
public class anagram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        int flag = 1;
        HashMap<Character,Integer> ana= new HashMap<>();
        for (int i = 0;i<s.length();i++){
            ana.put(s.charAt(i),ana.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<s1.length();i++){

            if(ana.containsKey(s1.charAt(i))) {
                ana.put(s1.charAt(i), ana.get(s1.charAt(i)) - 1);
            }
            if(ana.get(s1.charAt(i))==0){
                ana.remove(s1.charAt(i));
            }
            else{
                flag=0;
            }
        }
        if (ana.isEmpty()){
            flag =1;
        }
        if(flag==0){
            System.out.println("Not Anagram");
        }
        else{
            System.out.println("Anagram");
        }

    }
}
