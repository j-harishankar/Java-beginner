import java.util.Scanner;
public class vowCons {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int vow = 0;
        int con = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == 'A'||c =='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='o'||c=='O'||c=='u'||c=='U'){
                vow +=1;
            }
            else{
                con+=1;
            }

        }
        System.out.println("Vowel count: "+vow+"\n"+"consonant Count: "+con);
    }
}
