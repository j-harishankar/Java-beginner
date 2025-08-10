import java.util.Scanner;
public class Control {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the IP");
        int temp = scanner.nextInt();
        String result = temp > 30 ? "hot":"Cold";
        System.out.println(result);
        String role = "Moderator";
        switch (role){
            case "Moderator":
                System.out.println("Moderator");
                break;
            case "admin":
                System.out.println("admin");
                break;
            default:
                System.out.println("You are just a guest");
                break;
        }


    }
}
