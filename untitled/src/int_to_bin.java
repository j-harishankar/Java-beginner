public class int_to_bin {
    public static void main(String[] args){
        int n = 44;
        int binn[] =  new int[1000];
        int i = 0;
        while(n>0){
            binn[i] = n%2;
            n = n/2;
            i++;
        }
        for(int j = i-1;j>=0;j--)
        {
            System.out.print(binn[j]);
        }
    }



}
