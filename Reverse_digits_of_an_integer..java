import java.util.*;
public class re{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int re,rev=0;
        while(n!=0){
            re=n%10;
            rev=rev*10+re;
            n=n/10;
        }
        System.out.println(rev);
    }
}