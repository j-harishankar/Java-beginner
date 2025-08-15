import java.util.Scanner;
public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String s = sc.nextLine();
        int flag = 1;
        int k = s.length()-1;
        for(int i = 0;i<k/2;i++)
        {
            if(s.charAt(i) != s.charAt(k-i))
            {
                flag = 0;
            }
        }
        if (flag==1){
            System.out.println("pal");
        }
        else{
            System.out.println("No pal");
        }


    }
}
