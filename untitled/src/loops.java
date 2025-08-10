import java.util.Scanner;
public class loops {
    public static void main(String [] args)
    {
        String ip = " ";
        Scanner sc = new Scanner(System.in);
        while(!ip.equals("exit")){
             ip = sc.next().toLowerCase();
            System.out.println("Restarted");
        }
    }
}
