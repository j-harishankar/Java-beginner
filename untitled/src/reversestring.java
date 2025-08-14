import java.util.Scanner;
public class reversestring {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     int flag = 0;
     int k = s.length()-1;
     int n = (int)(s.length()/2)  ;
     for (int i = 0;i<=n;i++){
         if(s.charAt(i) != s.charAt(k-i))
         {
             flag = 1;
         }
     }
     if (flag == 1){
         System.out.println("np");
     }
     else{
         System.out.println("p");
     }
    }
}
