import java.util.*;
public class arr{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int eac: a){
           sum+=eac;
        }
        System.out.print(sum);
    }
}