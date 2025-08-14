class Human{
    private String name;
    private int age;
    public int getAge(int age){
        return age;
    }
    public String getName(String name){
        return name;
    }

}//private keyword creates encapsulation so that any other external classes cant directly access the
//variables or methods created inside the class that's encapusulated.
//so instead of directly calling using object they need to use functions to get values.
//For a private variable java provide two methods one is getter[returns value] and other is setter[sets value].



public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        int y=h.getAge(23);
        String x= h.getName("hari");
        System.out.println(x+":"+y);
    }


}
