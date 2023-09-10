import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int x=s.nextInt();
        int sa;
        if(n1>=n2){
            System.out.println(-1);
    }
    else
    {
        sa=(x/(n2-n1))+1;
        System.out.println(sa);
    }
}
}