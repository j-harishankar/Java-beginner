class Calculator
{
public int add(int a,int b){
    return a+b;
}
}


public class ClassDemo {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        Calculator cal = new Calculator();
        int res = cal.add(a,b);
        System.out.println(res);
    }
}
