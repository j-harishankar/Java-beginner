import java.sql.SQLOutput;

class Computer{
    public void MusicPlayer()
    {
        System.out.println("Music is Playing");
    }
    public String SellPen(int cost){
        if (cost>=10){
            return "Costly pen";
        }
        return "Cheap pen";
    }

}

public class MethodsDemo {
    public static void main(String[] args){
        Computer comp = new Computer();
        comp.MusicPlayer();
        String res = comp.SellPen(10);
        System.out.println(res);
        int arrr[] = new int[2];
        arrr[0] = 1;
        arrr[1]= 2;
        for(int i =0;i<2;i++){
            System.out.println(arrr[i]);
        }
        int mrr[][] = new int[4][3];
        for(int i = 0;i<4;i++){
            for(int j=0;j<3;j++){
                mrr[i][j] = (int)(Math.random()*100);
                System.out.print(mrr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
