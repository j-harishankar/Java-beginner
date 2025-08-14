import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // VARIABLES
        // primitive data type
        int myAge = 10;
        int herAge = myAge;
        long count = 123_456_789_678L;
        float my_float = 123.456f;
        double my_double = 123.456;
        char letter = 'A';
        boolean isEligible = true;
        System.out.println(herAge);

        //referenece data type like mail message,date etc...
        Date now = new Date();//new is required to allocate memory unlike primitive which autoallocates the memory
        System.out.println(now);

        int x =1;
        int y = x;
         x = 2; // when you print y the value will be same as 1 it wont change because y creates an memory where it stores initial value of x
        // but when we use the reference object it points to the address so it changes dynamically
        // string is an example of reference type but no need for new
        String message = "hello World"+"!!";
        System.out.println(message);
        System.out.println(message.replace("!","*"));
        System.out.println(message);//strings are immutable
        //ARRAYS
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(Arrays.toString(arr1));
        int[] numbers = {1,2,3,4,0};
        Arrays.sort(numbers);


        //use final to assign constant
        final float PI = 3.14f;
        //operators
        double div = (double)10/(double)3;
        System.out.println(div);

        //casting
        float c = 1.1f;
        int  d = (int)c+2;
        System.out.println(d);
        //string to int
        String s  = "1";
        int k = Integer.parseInt(s)+2;
        String st  = "1.1";
        int kk = Double.parseDouble(ss)+2;

        //Math class
        int result = Math.round(1.1f);
        int result1 = (int)Math.ceil(1.1f);
        int result2 = (int)Math.ceil(1.1f);
        int result3 = Math.max(1,3);
        double result5 = Math.random();//between 0 and 1
        int result6 = (int)Math.round(Math.random()*100);
        //or
        int result7 = (int)(Math.random() * 100);
        System.out.println(result6);
        //Number Formatting
        NumberFormat currency = NumberFormat.getCompactNumberInstance();
        String res = currency.format(123435.68);
        System.out.println(res);
        //or
        String currency1 = NumberFormat.getCompactNumberInstance().format(123435.68);

        
    }
}