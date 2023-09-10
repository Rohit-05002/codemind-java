import java.util.*;
public class dis{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int bn=b*512;
        int sn=bn*s;
        int tn=sn*t;
        int max=tn*2;
        System.out.print(max);
    }
}