public class ForEach {
    public static void main(String[] args){
        String[] Fruits = {"apple","orange","banana"};
        for(int i=0;i<Fruits.length;i++)
        {
            System.out.println(Fruits[i]);
        }
        for(String fruit : Fruits)
        {
            System.out.println(fruit);
        }
    }
}
