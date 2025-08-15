import java.util.Scanner;
public class strrev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String k = sc.nextLine();
        String s = "";
        int l = k.length()-1;
        for (int i = l;i>=0;i--){
            s += k.charAt(i);
        }
        System.out.println(s);
    }
}
