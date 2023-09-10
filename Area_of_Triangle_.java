import java.util.*;
public class in{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2;
        double ar=(s*(s-a)*(s-b)*(s-c));
        double sq=Math.sqrt(ar);
        System.out.printf("%.2f",sq);
    }
}